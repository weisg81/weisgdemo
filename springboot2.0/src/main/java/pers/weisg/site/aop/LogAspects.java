package pers.weisg.site.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.UUID;

/**
 * @Description: 切面类
 * @author WEISANGNG
 * @date 2018年6月2日
 */
@Aspect//告诉Spring当前类是一个切面类
@Component
public class LogAspects {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

	/**
	 * @Description:抽取公共的切入点表达式 1、本类引用;2、其他的切面引用
	 * @author WEISANGNG
	 * @date 2018年6月2日
	 */
	@Pointcut("execution(public int pers.weisg.site.aop.MathCalculator.*(..))")
	public void pointCut() {
	}

	// @Before在目标方法之前切入；切入点表达式（指定在哪个方法切入）
	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        request.setAttribute("requestId",UUID.randomUUID().toString());
        Object[] args = joinPoint.getArgs();
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("URI : " + request.getRequestURI());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(args));
        //获取所有参数方法一：
        Enumeration<String> enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            System.out.println(paraName+": "+request.getParameter(paraName));
        }

	}

	@After("pers.weisg.site.aop.LogAspects.pointCut()")
	public void logEnd(JoinPoint joinPoint) {
		System.out.println("" + joinPoint.getSignature().getName() + "结束。。。@After");
	}

	// JoinPoint一定要出现在参数表的第一位
	@AfterReturning(value = "pointCut()", returning = "result")
	public void logReturn(JoinPoint joinPoint, Object result) {
		System.out.println("" + joinPoint.getSignature().getName() + "正常返回。。。@AfterReturning:运行结果：{" + result + "}");
	}

	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(JoinPoint joinPoint, Exception exception) {
		System.out.println("" + joinPoint.getSignature().getName() + "异常。。。异常信息：{" + exception + "}");
	}

}

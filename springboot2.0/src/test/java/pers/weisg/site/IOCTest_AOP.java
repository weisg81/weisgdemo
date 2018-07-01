package pers.weisg.site;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pers.weisg.site.aop.MathCalculator;
import pers.weisg.site.common.conf.MainConfigOfAOP;

/**
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG
 * @date 2018年6月2日
 */
public class IOCTest_AOP {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigOfAOP.class);

		// 1、不要自己创建对象
		// MathCalculator mathCalculator = new MathCalculator();
		// mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

		mathCalculator.div(6, 4);

		applicationContext.close();
	}
}

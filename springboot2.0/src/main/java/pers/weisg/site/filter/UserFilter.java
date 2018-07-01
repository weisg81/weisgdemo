package pers.weisg.site.filter;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
import pers.weisg.site.service.UserService;

import javax.servlet.*;
import java.io.IOException;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年5月13日   
 */
@Component
//@ServletComponentScan
//@WebFilter(filterName="userFilter",urlPatterns="/**")
public class UserFilter implements Filter,ServletContextAware,BeanNameAware{
	
	@Autowired
	private UserService userService;
	
	private ServletContext servletContext;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
//		System.out.println("----------userService------"+userService);
		chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
//		System.out.println("-------servletContext---------"+servletContext);
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
//		System.out.println("--===============-----servletContext---------"+servletContext);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("当前bean的名字："+name);
	}

}

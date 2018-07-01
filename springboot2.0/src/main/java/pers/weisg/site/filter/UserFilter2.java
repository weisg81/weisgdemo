package pers.weisg.site.filter;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
import pers.weisg.site.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2018/6/3
 **/
@Component
@WebFilter(urlPatterns={"/admin/*"}, filterName="tokenAuthorFilter")
public class UserFilter2 implements Filter,ServletContextAware,BeanNameAware {

    @Autowired
    private UserService userService;

    private ServletContext servletContext;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("----------userService222------"+userService);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void setBeanName(String name) {
//        System.out.println("----------setBeanName----------");
//        System.out.println("当前bean的名字："+name);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
//        System.out.println("--===============-----servletContext2222---------"+servletContext);
    }
}

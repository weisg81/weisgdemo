package pers.weisg.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年2月15日   
 */
@SpringBootApplication
@ServletComponentScan
public class SiteApplication extends SpringBootServletInitializer{
	
	/**
	 * @Description: 为了实现独立war在tomcat中部署
	 * 				需要继承SpringBootServletInitializer并重写configure方法
	 * @param builder
	 * @return
	 * @author WEISANGNG
	 * @date 2018年5月13日
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SiteApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SiteApplication.class, args);
	}

}

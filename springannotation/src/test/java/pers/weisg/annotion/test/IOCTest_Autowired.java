package pers.weisg.annotion.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.weisg.annotion.bean.Boss;
import pers.weisg.annotion.bean.Car;
import pers.weisg.annotion.bean.Color;
import pers.weisg.annotion.config.MainConifgOfAutowired;
import pers.weisg.annotion.service.BookService;

public class IOCTest_Autowired {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		
		BookService bookService = applicationContext.getBean(BookService.class);
		System.out.println(bookService);
		
		//BookDao bean = applicationContext.getBean(BookDao.class);
		//System.out.println(bean);
		
		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
		
		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		System.out.println(applicationContext);
		applicationContext.close();
	}

}

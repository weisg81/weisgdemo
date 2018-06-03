package pers.weisg.annotion.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.weisg.annotion.tx.TxConfig;
import pers.weisg.annotion.tx.UserService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.insertUser();
		applicationContext.close();
	}

}

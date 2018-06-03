package pers.weisg.annotion.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.weisg.annotion.aop.MathCalculator;
import pers.weisg.annotion.config.MainConfigOfAOP;


public class IOCTest_AOP {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

		//1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

		mathCalculator.div(1, 0);

		applicationContext.close();
	}

}
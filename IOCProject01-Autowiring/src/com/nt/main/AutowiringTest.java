package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutowiringTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target spring bean class object reference
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the business method
		String msg=generator.generateMessage("rishitha");
		//display the result
		System.out.println("result is ::"+msg);
		//close the container
		ctx.close();
		
	}
}

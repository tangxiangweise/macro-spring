package com.macro.spring.di;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.macro.spring.bean.Teacher;
import com.macro.spring.conf.MacroDIConf;

public class DITest {

	@Test
	public void diTest() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
		        MacroDIConf.class);
		Teacher bean = applicationContext.getBean(Teacher.class);
		System.out.println(bean.getStudent());
		System.out.println(bean.getStudent());

	}

}

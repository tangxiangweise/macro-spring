package com.macro.spring.conf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.macro.spring.bean.Student;
import com.macro.spring.bean.Teacher;

@Configuration
@ComponentScan("com.macro.spring.bean")
public class MacroDIConf {

	@Bean
	@Scope("prototype")
	public Student student() {
		return new Student();
	}

	@Bean
	public Teacher teacher(Student student) {
		Map<String, Object> map = new HashMap<>();
		return new Teacher();
	}

	public static void main(String[] args) {
		int cap = 17;
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		System.out.println(n);
	}
}

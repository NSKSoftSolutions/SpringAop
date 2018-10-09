package com.spring.aop.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.configuration.SpringConfiguration;
import com.spring.aop.example.bean.User;
import com.spring.aop.repository.SpringRepository;


public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringRepository repo = context.getBean(SpringRepository.class);
		repo.save();
		

	}
}

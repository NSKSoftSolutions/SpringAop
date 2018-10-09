package com.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

	@Before("execution(void com.spring.aop.repository.SpringRepository.save())")
	public void beforeAdvice() {
		System.out.println("before saving user adding some services ");
	}
	
	@After("execution(void com.spring.aop.repository.SpringRepository.save())")
	public void AfterAdvice() {
		System.out.println("AFter saving user");
	}
	
	
	

}

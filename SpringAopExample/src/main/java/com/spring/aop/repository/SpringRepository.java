package com.spring.aop.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class SpringRepository {

	public void save() {

		System.out.println("hello AOP Dev");
	}

}

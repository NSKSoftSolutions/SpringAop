package com.spring.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = { "com.spring.aop.aspects", "com.spring.aop.repository", "com.spring.aop.example.bean" })
@EnableAspectJAutoProxy
public class SpringConfiguration {

}

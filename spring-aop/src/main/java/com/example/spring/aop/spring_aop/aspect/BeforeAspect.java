package com.example.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.example.spring.aop.spring_aop.business.*.*(..)")
	public void before(JoinPoint joinPoint) {
		logger.info("Intercepted Method Calls - {}",joinPoint);
	}
}

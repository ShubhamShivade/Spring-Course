package com.example.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value="execution(* com.example.spring.aop.spring_aop.business.*.*(..)",
			returning = "result"
			)
	public void after(JoinPoint joinPoint,Object result) {
		logger.info(" {} returned with value {} ",joinPoint,result);
	}
}

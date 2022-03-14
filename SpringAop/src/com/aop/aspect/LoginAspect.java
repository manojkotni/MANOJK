package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAspect {
	@Before("allGetters()")
	public void loginAdvice() {
		
		System.out.println("Advicce run.Get Method called");
	}
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second Advice executed");
	}
	
	@Pointcut("execution(*get()")
	public void allGetters() {
	
}
}

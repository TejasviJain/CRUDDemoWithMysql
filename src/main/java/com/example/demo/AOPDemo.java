package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPDemo 
{
	/*@Before(value="execution(public String Save*(..))")
	public void BeforeAdvice(JoinPoint joinpoint)
	{
		System.out.println("Before Method:" + joinpoint.getSignature());
	}*/
	
	
	/*
	 * @Before(value="execution(public com.example.demo.model.Author.get.*(..))")
	 * public void BeforeGetter(JoinPoint joinpoint) {
	 * System.out.println("Before Method:"+ joinpoint.getSignature()); }
	 */
	 
}

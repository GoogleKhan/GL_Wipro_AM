package com.wipro.EmployeeManagementSystem.config;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.wipro.EmployeeManagementSystem.model.AuditLog;
import com.wipro.EmployeeManagementSystem.repository.AuditLogRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class AspectConfig {

	@Autowired
	private AuditLogRepository auditLogRepository;

	// PointCut expression accessModifier returnType
	// packageName.className.methodName(..)
//	@Before("execution(public * com.wipro.EmployeeManagementSystem.service.*.*(..))")
//	public void logBeforeAll(JoinPoint joinPoint) {		
//		log.info(joinPoint.getSignature().getName() + " started");
//		
//	}
//	@After("execution(public * com.wipro.EmployeeManagementSystem.service.*.*(..))")
//	public void logAfterAll(JoinPoint joinPoint) {		
//		log.info(joinPoint.getSignature().getName() + " end");
//		
//	}

	@Around("execution(public * com.wipro.EmployeeManagementSystem.service.*.*(..))")
	public void logAroundAll(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		auditLogRepository.save(AuditLog.builder().date(LocalDate.now())
				.desc(proceedingJoinPoint.getSignature().getName() + " started").build());

		proceedingJoinPoint.proceed();

		auditLogRepository.save(AuditLog.builder().date(LocalDate.now())
				.desc(proceedingJoinPoint.getSignature().getName() + " ended").build());

	}

	@AfterReturning("execution(public * com.wipro.EmployeeManagementSystem.service.*.getAll(..))")
	public void logAfterReturn(JoinPoint jointPoint) throws Throwable {

		log.info(jointPoint.getSignature().getName() + " after returning");

	}

	@AfterThrowing("execution(public * com.wipro.EmployeeManagementSystem.service.*.getOne(..))")
	public void logAfterThrowing(JoinPoint jointPoint) throws Throwable {

		log.info(jointPoint.getSignature().getName() + " Some error");

	}

}

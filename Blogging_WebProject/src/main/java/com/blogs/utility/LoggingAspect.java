package com.blogs.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
//	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);
//	
//	@AfterThrowing(pointcut = "excution(*com.blogs.service.*Impl.*(..))", throwing = "exception")
//	public void logServiceException(Exception exception) throws Exception {
//		LOGGER.error(exception.getMessage(), exception);
//	}
}

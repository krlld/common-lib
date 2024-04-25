package com.example.commonlib.aop;

import com.example.commonlib.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class ServiceExceptionHandlerAspect {

    @Around("execution(* com.example.commonlib.service.ServiceInterface.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (DataAccessException e) {
            log.warn(e.getMessage());
            throw new ServiceException(e);
        } catch (Exception e) {
            String message = "Something wrong";
            log.warn(message);
            throw new RuntimeException(message);
        }
    }

}

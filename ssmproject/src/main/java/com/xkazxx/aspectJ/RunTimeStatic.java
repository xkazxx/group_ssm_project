package com.xkazxx.aspectJ;

import com.xkazxx.myAnnotation.SurpriseAnnotation;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunTimeStatic {
    Logger logger = Logger.getLogger(this.getClass());

    @Pointcut(value = "execution(* com.xkazxx.service.impl.SchedulingServiceImpl.*(..))")
    public void runTimeStaticPointCut(){}

    @Around("runTimeStaticPointCut()")
    public Object runTimeStatic(ProceedingJoinPoint joinPoint) throws Throwable {
        Long l1 = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        Long l2 = System.currentTimeMillis();
        logger.info("zhixingshijian：" + (l2 - l1));
        return proceed;
    }

    @Before("@annotation(surpriseAnnotation)")
    public void warningDeleteFile(SurpriseAnnotation surpriseAnnotation){
       logger.info("warnning：someone want to delete files+544++");
    }
}

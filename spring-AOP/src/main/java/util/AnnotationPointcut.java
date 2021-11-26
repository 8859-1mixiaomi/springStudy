package util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 编写一个注解实现的增强类
 *
 * @author xiaomi
 */
@Aspect
public class AnnotationPointcut {

    @Before("execution(* service.impl.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("注解方法执行前");

    }

    @After("execution(* service.impl.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("注解方式方法执行后");

    }

    @Around("execution(* service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名："+point.getSignature());
        //执行目标方法proceed
        Object proceed = point.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);

    }




}

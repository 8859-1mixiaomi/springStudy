package util;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 *
 */
public class BeforeLog implements MethodBeforeAdvice{

    //method : 要执行的目标对象的方法
    //objects : 被调用的方法的参数
    //Object : 目标对象


    public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("执行了"+target.getClass().getName()+"的"+method.getName()+"方法被执行了。。。");
    }
}

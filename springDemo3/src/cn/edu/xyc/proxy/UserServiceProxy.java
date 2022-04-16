package cn.edu.xyc.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Order(1)//优先级注解，括号里填数字类型的值，最小为0，值越写优先级越高
public class UserServiceProxy {
    //公共切入点
    @Pointcut(value = "execution(* cn.edu.xyc.service.UserService.add(..))")
    public void pointcut(){

    }

    //前置通知
    @Before(value = "pointcut()")
    public void before(){
        System.out.println("before...............");
    }

    //后置通知
    @AfterReturning(value = "pointcut()")
    public void afterReturning(){
        System.out.println("我是后置通知.........");
    }

    //环绕通知
    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前..........");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }

    //最终通知
    @After(value = "pointcut()")
    public void after(){
        System.out.println("我是最终通知.........");
    }

    //异常通知
    @AfterThrowing(value = "pointcut()")
    public void afterThrowing(){
        System.out.println("我是异常通知..........");
    }


}

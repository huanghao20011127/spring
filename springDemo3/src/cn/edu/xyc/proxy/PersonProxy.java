package cn.edu.xyc.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class PersonProxy {
    //前置通知
    @Before(value = "execution(* cn.edu.xyc.service.UserService.add(..))")
    public void before(){
        System.out.println("PersonProxy的before...............");
    }

}

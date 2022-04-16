package cn.edu.xyc.test;

import cn.edu.xyc.bean.Company;
import cn.edu.xyc.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanXmlTest {
    @Test
    public void beanXmlTest1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.toString());
    }
    @Test
    public void beanXmlTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Company company = context.getBean("company",Company.class);
        System.out.println(company.toString());
    }
    @Test
    public void beanXmlTest3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.toString());
    }
}

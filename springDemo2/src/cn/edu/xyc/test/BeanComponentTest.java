package cn.edu.xyc.test;

import cn.edu.xyc.bean.User;
import cn.edu.xyc.config.SpringConfig;
import cn.edu.xyc.controller.UserController;
import cn.edu.xyc.dao.UserDao;
import cn.edu.xyc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanComponentTest {
    @Test
    public void beanComponentTest1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        UserDao dao = context.getBean("userDao",UserDao.class);
        UserService service = context.getBean("userService",UserService.class);
        UserController controller = context.getBean("userController",UserController.class);
        System.out.println(user.toString());
        dao.userdao();
        service.userservice();
        controller.usercontroller();
    }

    //完全用注解的方式，不用xml配置文件
    @Test
    public void beanComponentTest2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user",User.class);
        UserDao dao = context.getBean("userDao",UserDao.class);
        UserService service = context.getBean("userService",UserService.class);
        UserController controller = context.getBean("userController",UserController.class);
        System.out.println(user.toString());
        dao.userdao();
        service.userservice();
        controller.usercontroller();
    }
}

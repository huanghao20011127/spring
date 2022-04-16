package cn.edu.xyc.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void add(){
        //int i = 10/0;//测试异常

        System.out.println("我是UserService里的add");
    }

}

package cn.edu.xyc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class User {
    @Value(value = "1")
    private int uId;
    @Value(value = "张三")
    private String uName;
    @Autowired     //根据类型进行属性注入
    @Qualifier(value = "company")     //根据名称进行注入        //@Resource  既可以根据名称也可以属性注入，该注解属于javax包中的
    private Company company;                                  //@Resource(name = "" )

    public User() {
    }

    public User(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }


    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", company=" + company +
                '}';
    }
}

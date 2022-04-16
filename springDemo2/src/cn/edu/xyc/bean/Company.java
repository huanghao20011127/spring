package cn.edu.xyc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "company")
public class Company {
    @Value(value = "1")
    private int cId;
    @Value(value = "蓝翔")
    private String cName;
    private List<User> users;

    public Company() {
    }

    public Company(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", users=" + users +
                '}';
    }
}

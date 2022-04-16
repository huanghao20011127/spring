package cn.edu.xyc.bean;

public class User {
    private int uId;
    private String uName;
    private Company company;

    public User() {
    }

    public User(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

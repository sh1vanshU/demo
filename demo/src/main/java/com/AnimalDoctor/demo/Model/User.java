package com.AnimalDoctor.demo.Model;

import java.util.List;

public class User {
    
    private String uId;
    private String userName;
    private String Email;

    private List<Animal> animal;
    
    
    public String getuId() {
        return uId;
    }
    public void setuId(String uId) {
        this.uId = uId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    
}

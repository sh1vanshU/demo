package com.AnimalDoctor.demo.Model;

import java.util.HashMap;

public class Animal {
    
    // try basic functionality.    
    private String Id;
    private String name;
    private String costOfOperation;
    // User is a owner, value is the percentage of Ownership.
    private HashMap<User,Integer> map;
    
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCostOfOperation() {
        return costOfOperation;
    }
    public void setCostOfOperation(String costOfOperation) {
        this.costOfOperation = costOfOperation;
    }

    

    
}

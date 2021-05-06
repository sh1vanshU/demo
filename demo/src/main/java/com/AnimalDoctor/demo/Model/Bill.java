package com.AnimalDoctor.demo.Model;

import java.util.List;

public class Bill {
    
    private String Id;
    private User user;
    private List<Animal>  animals;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    
    

}

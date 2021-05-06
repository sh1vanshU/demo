package com.AnimalDoctor.demo.Model;

public class Payment {
    
    private String pId;
    private PaymentType typeOfPayment;
    private long amountToBePaid;
    private User user;
    

    public String getpId() {
        return pId;
    }
    public void setpId(String pId) {
        this.pId = pId;
    }
    public PaymentType getTypeOfPayment() {
        return typeOfPayment;
    }
    public void setTypeOfPayment(PaymentType typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }
    public long getAmountToBePaid() {
        return amountToBePaid;
    }
    public void setAmountToBePaid(long amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    


}

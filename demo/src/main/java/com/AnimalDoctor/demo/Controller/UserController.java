package com.AnimalDoctor.demo.Controller;

import com.AnimalDoctor.demo.Interfaces.BillRepository;
import com.AnimalDoctor.demo.Model.Bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    

    @Autowired
    private BillRepository billRepository;

    @GetMapping("/bill/{userName}")
    public Bill getBill(String userName)
    {
        return billRepository.getByBill(userName);

    }

}

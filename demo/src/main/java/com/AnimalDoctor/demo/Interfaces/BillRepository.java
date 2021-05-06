package com.AnimalDoctor.demo.Interfaces;

import com.AnimalDoctor.demo.Model.Bill;

import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill,Long>{
    Bill getByBill(String  userName);
}

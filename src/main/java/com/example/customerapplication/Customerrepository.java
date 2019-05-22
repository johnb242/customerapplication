package com.example.customerapplication;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface Customerrepository extends CrudRepository<Customer, Long>{

    //Customer findById(Long id);
    ArrayList<Customer> findBylastname(String lastname);


}

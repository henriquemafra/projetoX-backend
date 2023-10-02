package com.projetoX.RestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoX.RestAPI.database.RepositorieCustomers;

import com.projetoX.RestAPI.entities.Customers;

@RestController
@RequestMapping("/customers")
public class CustomersREST {
    @Autowired
    private RepositorieCustomers repositorie;

    @GetMapping
    public List<Customers> show(){
        return repositorie.findAll();
    }

    @PostMapping
    public void save(@RequestBody Customers customers){
        repositorie.save(customers);
    }

    @PutMapping
    public void change(@RequestBody Customers customers){
        if(customers.getId() > 0)
        repositorie.save(customers);
    }

    @DeleteMapping
    public void delete(@RequestBody Customers customers){
        repositorie.delete(customers);
    }
}

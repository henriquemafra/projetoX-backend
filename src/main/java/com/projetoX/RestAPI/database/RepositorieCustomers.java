package com.projetoX.RestAPI.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoX.RestAPI.entities.Customers;

public interface RepositorieCustomers extends JpaRepository<Customers, Long> {
    
}

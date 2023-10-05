package com.SalesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.Customer;

@Repository("customerRepository")
public interface ICustomer extends JpaRepository<Customer, Integer> {

}

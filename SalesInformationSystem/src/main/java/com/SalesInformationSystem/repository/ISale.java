package com.SalesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.Sale;

@Repository("saleRepository")
public interface ISale extends JpaRepository<Sale, Integer> {

}

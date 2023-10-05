package com.SalesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.SaleProduct;


@Repository("saleProductRepository")
public interface ISaleProduct extends JpaRepository<SaleProduct, Integer>{

}

package com.SalesInformationSystem.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.Product;

@Repository("productRepository")
public interface IProduct extends JpaRepository<Product, Integer> {

    @Query(
            value = "SELECT * FROM productos ORDER BY codCategoria",
            nativeQuery = true
    )
    List<Product> getProductsOrderByCategory();

}

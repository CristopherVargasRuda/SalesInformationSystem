package com.SalesInformationSystem.service;

import java.util.ArrayList;

import com.SalesInformationSystem.entity.Customer;
import com.SalesInformationSystem.entity.SaleProduct;

public interface ISalesService {

    int createSale(Customer customer, double total);

    public void addProductsForSale(ArrayList<SaleProduct> saleProducts);


}

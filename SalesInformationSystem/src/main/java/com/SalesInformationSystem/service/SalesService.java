package com.SalesInformationSystem.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SalesInformationSystem.entity.Customer;
import com.SalesInformationSystem.entity.Sale;
import com.SalesInformationSystem.entity.SaleProduct;
import com.SalesInformationSystem.repository.ICustomer;
import com.SalesInformationSystem.repository.IProduct;
import com.SalesInformationSystem.repository.ISale;
import com.SalesInformationSystem.repository.ISaleProduct;

@Service("salesService")
@Transactional
public class SalesService implements ISalesService {

    @Autowired
    @Qualifier("saleRepository")
    private ISale saleRepository;

    @Autowired
    @Qualifier("saleProductRepository")
    private ISaleProduct saleProductRepository;

    @Autowired
    @Qualifier("customerRepository")
    private ICustomer customerRepository;

    @Autowired
    @Qualifier("productRepository")
    private IProduct productRepository;

    @Override
    public int createSale(Customer customer, double total) {
        customerRepository.save(customer);
        Sale sale = new Sale();
        sale.setCodeSale(Integer.parseInt(saleRepository.count() + "") + 1);
        sale.setDate(LocalDate.now());
        sale.setIdCustomer(customer.getIdCustomer());
        sale.setTotal(total);
        saleRepository.save(sale);
        return sale.getCodeSale();
    }

    @Override
    public void addProductsForSale(ArrayList<SaleProduct> saleProducts) {
        int code = (Integer.parseInt(saleProductRepository.count() + ""));
        for (int i = 0; i < saleProducts.size(); i++) {
            saleProducts.get(i).setCodeSaleProduct(code + i + 1);            
        }
        saleProductRepository.saveAll(saleProducts);
    }


}

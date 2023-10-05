package com.SalesInformationSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SalesInformationSystem.entity.Product;
import com.SalesInformationSystem.repository.IProduct;

@Service("contentHandlerService")
@Transactional
public class ContentHandlerService implements IContentHandlerService {

    @Autowired
    @Qualifier("productRepository")
    private IProduct productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getProductsOrderByCategory();
    }

}

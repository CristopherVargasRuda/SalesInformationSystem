package com.SalesInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SalesInformationSystem.entity.Product;
import com.SalesInformationSystem.service.ContentHandlerService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping
public class ContentHandlerController {

    @Autowired
    @Qualifier("contentHandlerService")
    private ContentHandlerService contentHandlerService;

    @GetMapping("/uploadProducts")
    public ResponseEntity<List<Product>> uploadProducts() {
        return new ResponseEntity<List<Product>>(contentHandlerService.getAllProducts(), HttpStatus.OK);
    }

}

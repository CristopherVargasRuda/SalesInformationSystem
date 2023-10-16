package com.SalesInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.SalesInformationSystem.entity.Product;
import com.SalesInformationSystem.service.ContentHandlerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping
public class ContentHandlerController {

    @Autowired
    @Qualifier("contentHandlerService")
    private ContentHandlerService contentHandlerService;

    @CrossOrigin(origins = "*")
    @GetMapping("/uploadProducts")
    public ResponseEntity<List<Product>> uploadProducts() {
        return new ResponseEntity<List<Product>>(contentHandlerService.getAllProducts(), HttpStatus.OK);
    }

}

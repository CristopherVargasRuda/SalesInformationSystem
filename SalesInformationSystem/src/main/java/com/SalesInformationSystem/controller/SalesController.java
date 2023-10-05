package com.SalesInformationSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SalesInformationSystem.entity.Customer;
import com.SalesInformationSystem.entity.SaleProduct;
import com.SalesInformationSystem.entity.dto.SaleProductDto;
import com.SalesInformationSystem.service.SalesService;

@Controller
@RequestMapping
public class SalesController {

    @Autowired
    @Qualifier("salesService")
    private SalesService salesService;

    @GetMapping("/confirmSale/{idCustomer}/{nameCustomer}/{total}")
    public String confirmSale(@RequestBody List<SaleProductDto> SaleProductsDto, 
    		@PathVariable int idCustomer, @PathVariable String nameCustomer, 
    		@PathVariable double total
    		) {
        Customer customer = new Customer();
        customer.setIdCustomer(idCustomer);
        customer.setName(nameCustomer);
        int codeSale = salesService.createSale(customer, total);
        ArrayList<SaleProduct> saleProducts = new ArrayList<>();
        for (SaleProductDto saleProductDto : SaleProductsDto) {
            SaleProduct saleProduct = new SaleProduct();
            saleProduct.setCodeProduct(saleProductDto.getCodeProduct());
            saleProduct.setQuantitySold(saleProductDto.getQuantitySold());
            saleProduct.setCodeSale(codeSale);            
        }
        salesService.addProductsForSale(saleProducts);
        return null;
    }

}

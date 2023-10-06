package com.SalesInformationSystem.entity.dto;

public class SaleProductDto {

    private Integer codeProduct;
    private Integer quantitySold;

    public SaleProductDto(Integer codeProduct, Integer quantitySold) {
        this.codeProduct = codeProduct;
        this.quantitySold = quantitySold;
    }

    public Integer getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Integer codeProduct) {
        this.codeProduct = codeProduct;
    }

    public Integer getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(Integer quantitySold) {
        this.quantitySold = quantitySold;
    }
}
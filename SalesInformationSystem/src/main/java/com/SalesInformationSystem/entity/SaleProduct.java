package com.SalesInformationSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Venta_Producto")
public class SaleProduct {

    @Id
    @Column(name = "codventaproducto", nullable = false)
    private int codeSaleProduct;

    @Column(name = "codventa", nullable = false)
    private int codeSale;

    @Column(name = "codproducto", nullable = false)
    private int codeProduct;

    @Column(name = "cantidadvendida", nullable = false)
    private int quantitySold;

    public int getCodeSaleProduct() {
        return codeSaleProduct;
    }

    public void setCodeSaleProduct(int codeSaleProduct) {
        this.codeSaleProduct = codeSaleProduct;
    }

    public int getCodeSale() {
        return codeSale;
    }

    public void setCodeSale(int codeSale) {
        this.codeSale = codeSale;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
}

package com.SalesInformationSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Product {

    @Id
    @Column(name = "codproducto", nullable = false)
    private int codeProduct;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "preciounitario", nullable = false)
    private int unitPrice;

    @Column(name = "codcategoria", nullable = false)
    private int codeCategory;

    @Column(name = "codproveedor", nullable = false)
    private int codeProvider;

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(int codeCategory) {
        this.codeCategory = codeCategory;
    }

    public int getCodeProvider() {
        return codeProvider;
    }

    public void setCodeProvider(int codeProvider) {
        this.codeProvider = codeProvider;
    }
}

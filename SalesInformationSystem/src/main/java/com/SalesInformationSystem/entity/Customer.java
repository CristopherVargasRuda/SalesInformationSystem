package com.SalesInformationSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Customer {

    @Id
    @Column(name = "cedula", nullable = false)
    private int idCustomer;

    @Column(name = "nombre", nullable = false)
    private String name;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

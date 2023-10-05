package com.SalesInformationSystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ventas")
public class Sale {

    @Id
    @Column(name = "codventa", nullable = false)
    private int codeSale;

    @Column(name = "fecha", nullable = false)
    private LocalDate date;

    @Column(name = "valortotal", nullable = false)
    private double total;

    @Column(name = "cedula", nullable = false)
    private int idCustomer;

    public int getCodeSale() {
        return codeSale;
    }

    public void setCodeSale(int codeSale) {
        this.codeSale = codeSale;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}

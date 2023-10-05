package com.SalesInformationSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Provider {

    @Id
    @Column(name = "codproveedor", nullable = false)
    private int codeProvider;

    @Column(name = "nombreproveedor", nullable = false)
    private String nameProvider;

    public int getCodeProvider() {
        return codeProvider;
    }

    public void setCodeProvider(int codeProvider) {
        this.codeProvider = codeProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }
}

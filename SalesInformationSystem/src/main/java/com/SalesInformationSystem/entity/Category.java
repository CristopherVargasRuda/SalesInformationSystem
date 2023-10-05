package com.SalesInformationSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Category {

    @Id
    @Column(name = "codcategoria", nullable = false)
    private int codeCategory;

    @Column(name = "nombrecategoria", nullable = false)
    private String nameCategory;

    public int getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(int codeCategory) {
        this.codeCategory = codeCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}

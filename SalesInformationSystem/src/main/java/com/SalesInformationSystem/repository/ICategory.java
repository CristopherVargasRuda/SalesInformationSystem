package com.SalesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.Category;

@Repository("categoryRepository")
public interface ICategory extends JpaRepository<Category, Integer> {

}

package com.SalesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SalesInformationSystem.entity.Provider;


@Repository("providerRepository")
public interface IProvider extends JpaRepository<Provider, Integer> {

}

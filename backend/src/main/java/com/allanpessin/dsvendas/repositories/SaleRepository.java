package com.allanpessin.dsvendas.repositories;

import com.allanpessin.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
  
}

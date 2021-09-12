package com.allanpessin.dsvendas.repositories;

import com.allanpessin.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
  
}

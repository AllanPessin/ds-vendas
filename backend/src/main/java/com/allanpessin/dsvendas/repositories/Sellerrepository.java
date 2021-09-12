package com.allanpessin.dsvendas.repositories;

import com.allanpessin.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Sellerrepository extends JpaRepository<Seller, Long> {
  
}

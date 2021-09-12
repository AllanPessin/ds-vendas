package com.allanpessin.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.allanpessin.dsvendas.dto.SellerDTO;
import com.allanpessin.dsvendas.entities.Seller;
import com.allanpessin.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
  
  @Autowired
  private SellerRepository repository;
  
  public List<SellerDTO> findAll() {
    List<Seller> result = repository.findAll();
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
  }
}

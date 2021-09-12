package com.allanpessin.dsvendas.service;

import java.util.List;

import com.allanpessin.dsvendas.dto.SaleDTO;
import com.allanpessin.dsvendas.dto.SaleSuccessDTO;
import com.allanpessin.dsvendas.dto.SaleSumDTO;
import com.allanpessin.dsvendas.entities.Sale;
import com.allanpessin.dsvendas.repositories.SaleRepository;
import com.allanpessin.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
  
  @Autowired
  private SaleRepository repository;

  @Autowired
  private SellerRepository sellerRepository;

  @Transactional(readOnly = true)
  public Page<SaleDTO> findAll(Pageable pageable) {
    sellerRepository.findAll();
    Page<Sale> result = repository.findAll(pageable);
    return result.map(x -> new SaleDTO(x));
  }

  @Transactional(readOnly = true)
  public List<SaleSumDTO> amountGroupedBySeller() {
    return repository.amountGroupedBySeller();
  }

  @Transactional(readOnly = true)
  public List<SaleSuccessDTO> successGroupedBySeller() {
    return repository.successGroupedBySeller();
  }
}

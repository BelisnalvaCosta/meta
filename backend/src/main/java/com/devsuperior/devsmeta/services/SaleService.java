package com.devsuperior.devsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.devsmeta.entities.Sale;
import com.devsuperior.devsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(Pageable pageable) {
		return repository.findAll(pageable);				
		
	}

}

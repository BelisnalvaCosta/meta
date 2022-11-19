package com.devsuperior.devsmeta.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.devsuperior.devsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	Page<Sale> findAll(Pageable pageable);

}

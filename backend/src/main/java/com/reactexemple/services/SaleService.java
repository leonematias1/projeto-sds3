package com.reactexemple.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reactexemple.dto.SaleDTO;
import com.reactexemple.dto.SalesSuccessDTO;
import com.reactexemple.dto.SalesSumDTO;
import com.reactexemple.entities.Sale;
import com.reactexemple.repositories.SaleRepository;
import com.reactexemple.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> getAllSales(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> listSales = saleRepository.findAll(pageable);
		return listSales.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SalesSuccessDTO> successGroupedBySeller(){
		return saleRepository.successGroupedBySeller();
	}
	
}

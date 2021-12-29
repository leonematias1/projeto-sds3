package com.reactexemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactexemple.dto.SaleDTO;
import com.reactexemple.dto.SalesSuccessDTO;
import com.reactexemple.dto.SalesSumDTO;
import com.reactexemple.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleRestController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping(value = "/get-all-sellers")
	public ResponseEntity<Page<SaleDTO>> getAllSeller(Pageable pageable){
		Page<SaleDTO> listSales = saleService.getAllSales(pageable);
		return ResponseEntity.ok(listSales);	
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SalesSumDTO>> amountGroupedBySeller(){
		List<SalesSumDTO> listSales = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(listSales);	
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SalesSuccessDTO>> successGroupedBySeller(){
		List<SalesSuccessDTO> listSales = saleService.successGroupedBySeller();
		return ResponseEntity.ok(listSales);	
	}
}

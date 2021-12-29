package com.reactexemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactexemple.dto.SellerDTO;
import com.reactexemple.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerRestController {

	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> getAllSeller(){
		List<SellerDTO> listSeller = sellerService.getAllSellers();
		return ResponseEntity.ok(listSeller);	
	}
	
}

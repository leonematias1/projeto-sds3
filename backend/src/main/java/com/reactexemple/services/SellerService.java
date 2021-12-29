package com.reactexemple.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactexemple.dto.SellerDTO;
import com.reactexemple.entities.Seller;
import com.reactexemple.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> getAllSellers(){
		List<Seller> listSellers = sellerRepository.findAll();
		return listSellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}

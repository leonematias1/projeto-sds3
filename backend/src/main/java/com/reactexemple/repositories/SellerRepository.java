package com.reactexemple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactexemple.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}

package com.vobi.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vobi.bank.domain.DocumentType;

import antlr.collections.List;

public interface DocumentTypeRepository extends JpaRepository<DocumentType, Integer> {
	
}

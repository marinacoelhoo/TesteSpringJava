package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.CasadosFast;

@Repository
public interface TestRepositoryFast extends JpaRepository<CasadosFast, String>{
	
	List<CasadosFast> findByCustomerName(String customerName);
}

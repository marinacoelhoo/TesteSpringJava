package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.TestModel;

@Repository 
public interface TestRepository extends JpaRepository<TestModel, Long>{
	
	List<TestModel> findByName(String name);

}

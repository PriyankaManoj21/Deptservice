package com.test.deptservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Integer> {
	
	
	Dept findByDept(String dept);
	
	

}

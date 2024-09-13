package com.test.deptservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	
	@Autowired
	DeptRepo deptrepo;
	
	@RequestMapping(value="/savedept" ,method = RequestMethod.POST)
	public ResponseEntity<Dept> saveUser(@RequestBody Dept Dept){
		System.out.println(Dept);
		deptrepo.save(Dept);
		return new ResponseEntity<Dept>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/getdepts" ,method = RequestMethod.GET)
	public ResponseEntity<List<Dept>> get(){
		
		List<Dept> Dept = deptrepo.findAll();
		return new ResponseEntity<List<Dept>>(Dept,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/getdept" ,method = RequestMethod.GET)
	public ResponseEntity<Dept> getDept(@RequestParam String deptname ){
		
		Dept Dept = deptrepo.findByDept(deptname);
		return new ResponseEntity<Dept>(Dept,HttpStatus.OK);
		
	}

}

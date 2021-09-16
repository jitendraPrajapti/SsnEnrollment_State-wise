package com.taazaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taazaa.Service.SsnService;
import com.taazaa.model.SsnEnrollmentRequest;

@RestController
public class SsnEnrollmentRestController {
	
	@Autowired
	private SsnService ssnservice;
	
	@PostMapping(value="/ssnEnrollment", consumes="appliacation/json")
	
	public ResponseEntity<String>  enroll( @RequestBody SsnEnrollmentRequest req){
		
		  long ssn=ssnservice.ssnEnrollment(req); 
		  String body= "your ssn Enrollment Complete Successfully ssn is::" +ssn;
		   
		 
		 return new ResponseEntity<>(body,HttpStatus.CREATED);
	}

}

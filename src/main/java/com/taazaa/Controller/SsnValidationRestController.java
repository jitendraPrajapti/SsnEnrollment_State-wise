package com.taazaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.taazaa.Service.SsnService;
@RestController
public class SsnValidationRestController {
	
	@Autowired
	private SsnService sService;
	
	
	
	@GetMapping(value="/validation/{ssn}/{state}")
	public ResponseEntity<String> validate(@PathVariable(name="ssn")String ssn,@PathVariable(name="state")String state){
	 ResponseEntity<String > response=null;
	  String status= sService.checkEnro(Long.parseLong (ssn), state);
	  response=new ResponseEntity<String>(status,HttpStatus.OK);
	  
		return response;
	}

}

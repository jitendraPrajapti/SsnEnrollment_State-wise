package com.taazaa.Service;

import java.util.List;

import com.taazaa.model.SsnEnrollmentRequest;

public interface SsnService {
	
	public List<String> getAllstateName();
	 public long ssnEnrollment(SsnEnrollmentRequest  req);
	
	 public String checkEnro(long ssn , String stateName);

}

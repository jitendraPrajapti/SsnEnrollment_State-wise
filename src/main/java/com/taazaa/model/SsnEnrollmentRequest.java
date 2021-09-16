package com.taazaa.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data

public class SsnEnrollmentRequest {

	private long ssn;

	private String Fname;

	private String lname;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dob;

	private String gender;

	private String stateName;

}

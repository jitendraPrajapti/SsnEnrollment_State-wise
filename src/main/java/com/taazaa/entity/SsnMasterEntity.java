package com.taazaa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "ssn_Master")
public class SsnMasterEntity {

	@Id
	@GeneratedValue

	private long ssn;
	@Column(name = "Fname")
	private String Fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "stateName")
	private String stateName;
	@Column(name = "createDate", updatable = false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createDate;

	@Column(name = "updateDate", insertable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updateDate;

}

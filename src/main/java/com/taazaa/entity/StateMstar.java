package com.taazaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="state_mastar")
public class StateMstar {
	@Id
	@Column(name="state_id")
	private Integer State_ID;
	@Column(name="state_Name")
	private String stateName;
}

package com.taazaa.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taazaa.entity.SsnMasterEntity;

public interface SsnMasterRepo extends JpaRepository<SsnMasterEntity, Serializable> {
	
	/* @Query(value="select ssn from  ssn_Master") */
	public SsnMasterEntity findByssn(long ssn,String stateName);
}

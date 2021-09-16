package com.taazaa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taazaa.entity.StateMstar;

public interface StateMasterRepo  extends JpaRepository<StateMstar, Integer >{

	@Query(value="select stateName from  StateMstar")
	public List<String> findStateName();
	
}

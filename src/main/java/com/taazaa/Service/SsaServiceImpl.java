package com.taazaa.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taazaa.Repo.SsnMasterRepo;
import com.taazaa.Repo.StateMasterRepo;
import com.taazaa.entity.SsnMasterEntity;
import com.taazaa.model.SsnEnrollmentRequest;

@Service
public class SsaServiceImpl implements SsnService {

	@Autowired
	private SsnMasterRepo ssnRepo;
	@Autowired
	private StateMasterRepo smRepo;

	@Override
	public List<String> getAllstateName() {
		// TODO Auto-generated method stub
		return smRepo.findStateName();

	}

	@Override
	public long ssnEnrollment(SsnEnrollmentRequest req) {
		// TODO Auto-generated method stub
		SsnMasterEntity entity = new SsnMasterEntity();
		BeanUtils.copyProperties(req, entity);
		SsnMasterEntity saveEntity = ssnRepo.save(entity);

		if (saveEntity != null) {
			return saveEntity.getSsn();
		} 
		return null;

		
	}

	@Override
	public String checkEnro(long ssn, String stateName) {
		// TODO Auto-generated method stub

		SsnMasterEntity entity = ssnRepo.findByssn(ssn, stateName);
		if (entity != null) {
			return "valid";
		}

		return "Invalid";
	}

}

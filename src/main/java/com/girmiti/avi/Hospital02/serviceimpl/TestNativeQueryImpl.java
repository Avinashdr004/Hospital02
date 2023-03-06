package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.TestNativeQuery;
@Service
public class TestNativeQueryImpl implements TestNativeQuery{

	@Autowired
	private DocRepo docRepo;
	
	@Override
	public List<Doctor> nativeQueryTest() {
		List<Doctor> dq= docRepo.queryTest();
		return dq;
		
		
	}

}

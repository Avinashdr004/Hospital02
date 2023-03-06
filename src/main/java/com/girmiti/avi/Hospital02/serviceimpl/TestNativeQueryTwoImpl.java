package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.TestNativeQueryTwo;
@Service
public class TestNativeQueryTwoImpl implements TestNativeQueryTwo {

	@Autowired
	private DocRepo docRepo;
	
	@Override
	public List<Doctor> nativeQuery() {
		List<Doctor> drn=docRepo.queryTestTwo();
		return drn;
	}

	
}

package com.girmiti.avi.Hospital02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.entity.Doctor;
@Service
public interface TestNativeQuery {

	public List<Doctor> nativeQueryTest();
	
	
}

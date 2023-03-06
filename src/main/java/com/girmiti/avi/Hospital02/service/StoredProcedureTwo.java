package com.girmiti.avi.Hospital02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.entity.Doctor;
@Service
public interface StoredProcedureTwo {

public List<Doctor> genderStoredProcedure(char var );
	
public Object storedProcedureOut();

public Object storedProcedureinOut(int a);

public  Character  queryQuery(int a);


}

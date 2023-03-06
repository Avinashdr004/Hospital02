package com.girmiti.avi.Hospital02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.entity.Doctor;

@Service
public interface AccessDocByName {
 public  List<Doctor> findByDname(String dname);
	
}

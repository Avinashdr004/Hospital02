package com.girmiti.avi.Hospital02.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.entity.Doctor;

@Service
public interface SaveDoc {
	
 public ResponseEntity<String> saveDoc (Doctor d);
	
}

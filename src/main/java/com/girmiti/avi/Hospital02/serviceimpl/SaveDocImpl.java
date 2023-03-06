package com.girmiti.avi.Hospital02.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.SaveDoc;

@Service
public class SaveDocImpl implements SaveDoc {
@Autowired
 private DocRepo docRepo;

@Override
public ResponseEntity<String> saveDoc(Doctor d) {
	Doctor doctor=docRepo.save(d);
	return ResponseEntity.status(201).body("doc account created successfully");
}

	

}

package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.AccessDoc;
@Service
public class AccessDocImpl implements AccessDoc {
@Autowired	
private DocRepo docRepo;
	 
	@Override
	public Optional<Doctor> accessDoc(int id) {
		Optional<Doctor> d=docRepo.findById(id);
		return d;
	}

}

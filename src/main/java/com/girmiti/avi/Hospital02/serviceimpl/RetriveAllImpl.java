package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.RetrieveAll;
@Service
public class RetriveAllImpl implements RetrieveAll {

	@Autowired
	private DocRepo docRepo;
	
	@Override
	public List<Doctor> readall() {
		List<Doctor> d = docRepo.findAll();
		return d;
		
	}

}

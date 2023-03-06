package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.AccessDocByName;
@Service
public class AccessDocByNameImpl  implements AccessDocByName{

	@Autowired
	private DocRepo docRepo;
	
	@Override
	public List<Doctor> findByDname(String dname) {
		List<Doctor> d3 =docRepo.findByDname(dname);
		return d3;
	}
 
}

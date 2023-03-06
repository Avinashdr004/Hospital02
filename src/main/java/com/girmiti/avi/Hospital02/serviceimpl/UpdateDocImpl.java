package com.girmiti.avi.Hospital02.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.UpdateDoc;
@Service
public class UpdateDocImpl implements UpdateDoc{

	@Autowired
	private DocRepo docRepo;
	@Override
	public void upgrade(int id) {
		Doctor d4= docRepo.getById(id);
		d4.setAge(28);
		d4.setPassword("avi004");
		docRepo.save(d4);
	}

}

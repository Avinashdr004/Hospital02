package com.girmiti.avi.Hospital02.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.service.DeleteDoc;
@Service
public class DeleteDocImpl implements DeleteDoc {

	@Autowired
	private DocRepo docRepo;
	
	@Override
	public String eraseDoc(int id) {
		docRepo.deleteById( id);
		return "deleted successfully";
		
	}

}

package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.StoredProcedure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class StoredProcedureImpl implements StoredProcedure{


	
	 @Autowired
	 @PersistenceContext
	 private EntityManager entityManager;
	 
	
	@Override
	public List<Doctor> getage_10() {
		List<Doctor> dr= entityManager.createNamedStoredProcedureQuery("abcd").getResultList();
		return dr;
	}


	}



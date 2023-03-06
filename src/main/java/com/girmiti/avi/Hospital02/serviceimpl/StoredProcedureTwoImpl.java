package com.girmiti.avi.Hospital02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.docrepo.DocRepo;
import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.StoredProcedureTwo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Service
public class StoredProcedureTwoImpl implements StoredProcedureTwo{

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Doctor> genderStoredProcedure(char var) {
		List<Doctor> dr = entityManager.createNamedStoredProcedureQuery("efg")
			.setParameter("var",var).getResultList();
		return dr;
	}
@PersistenceContext
@Autowired
private EntityManager entityManager2;

	@Override
	public Object storedProcedureOut() {
		return entityManager2.createNamedStoredProcedureQuery("hij").getOutputParameterValue("op");
	}
    @PersistenceContext
	@Autowired
	private EntityManager entityManager3;
	
	@Override
	public Object storedProcedureinOut(int a) {
		return entityManager3.createNamedStoredProcedureQuery("klm").setParameter("io", a).getOutputParameterValue("io");
	}

	@Autowired
	private DocRepo doccc;
	
	
	@Override
	public Character queryQuery(int a) {
		char com =doccc.storedProcedureJpaFind(a);
		return com ;
		
	}
	
	
	
	

}

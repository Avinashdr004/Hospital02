package com.girmiti.avi.Hospital02.docrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.girmiti.avi.Hospital02.entity.Doctor;
@Repository
public interface DocRepo extends JpaRepository<Doctor, Integer> {
	public List<Doctor> findByDname(String dname);
	
@Query(value="select d from Doctor d where d.age>10")
List<Doctor> queryTest();

@Query(value="select d from Doctor d where d.age>10 and d.dname='kiransir'")
public List<Doctor> queryTestTwo();

  @Procedure(procedureName = "new_inout_jpa_procedure")
public char storedProcedureJpaFind(int did);



}

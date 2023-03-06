package com.girmiti.avi.Hospital02.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.girmiti.avi.Hospital02.entity.Doctor;
import com.girmiti.avi.Hospital02.service.AccessDoc;
import com.girmiti.avi.Hospital02.service.AccessDocByName;
import com.girmiti.avi.Hospital02.service.DeleteDoc;
import com.girmiti.avi.Hospital02.service.RetrieveAll;
import com.girmiti.avi.Hospital02.service.SaveDoc;
import com.girmiti.avi.Hospital02.service.StoredProcedure;
import com.girmiti.avi.Hospital02.service.StoredProcedureTwo;
import com.girmiti.avi.Hospital02.service.TestNativeQuery;
import com.girmiti.avi.Hospital02.service.TestNativeQueryTwo;
import com.girmiti.avi.Hospital02.service.UpdateDoc;

import jakarta.transaction.Transactional;

@RestController
public class DocController {
@RequestMapping("/test")
	public ResponseEntity<String> test () {
		 return ResponseEntity.status(200).body("application is working properly");
	}
   
@Autowired
private SaveDoc savingDoc;
 
@RequestMapping("/save")
public ResponseEntity<String> saveOne(@RequestBody Doctor d) {
	return savingDoc.saveDoc(d);
}


	
@Autowired
private AccessDoc accessDoc;

@RequestMapping("/find")
public Optional<Doctor> findDoc(@RequestParam int id) {
	return accessDoc.accessDoc(id);
}




//consuming api
@GetMapping(value="/clientcallfind")
public String getClientCall() {
	String uri="http://localhost:8080/find?id=3";
	RestTemplate restTemplate= new RestTemplate();
	String result = restTemplate.getForObject(uri, String.class);
	return result;
}






@Autowired
private AccessDocByName accessDocByName;
@RequestMapping("/retrieve")
public List<Doctor> retrieve(@RequestParam String dname) {
	return accessDocByName.findByDname(dname);
}




@Autowired
private DeleteDoc deleteDoc;
@RequestMapping("/delete")
public String trunc(@RequestParam int id) {
	return deleteDoc.eraseDoc(id);
}




@Autowired
private UpdateDoc updateDoc;
@RequestMapping("/update")
public void levelUp(@RequestParam int id) {
	updateDoc.upgrade(id);
}



	
@Autowired
private RetrieveAll retrieveAll;
@RequestMapping("/retrieveall")
public List<Doctor> getAll() {
	return retrieveAll.readall();
}




@Autowired
 private TestNativeQuery nativeQuery;

@RequestMapping("/testQuery")
public List<Doctor> query(){
	return nativeQuery.nativeQueryTest();
}



@Autowired
private TestNativeQueryTwo nativeQueryTwo;   

@RequestMapping(value="/testquerytwo")
public List<Doctor> queryTwo(){
	return nativeQueryTwo.nativeQuery();
}



@GetMapping(value="/clientcalltwo")
public String getclientcallto() {
	String uri="http://localhost:8080/testquerytwo";
	RestTemplate restTemplate= new RestTemplate();
	String result=restTemplate.getForObject(uri, String.class);
	return result;
}


@Autowired
private StoredProcedure procedure;

@RequestMapping("/getage")
public List<Doctor> getByAge() {
	return procedure.getage_10();
}


@Autowired
private StoredProcedureTwo procedureTwo;


@RequestMapping(path = "/getbygender")
public List<Doctor> getByGender(@RequestParam("gender") char var){
	
	return procedureTwo.genderStoredProcedure(var);
	}

@Autowired
private StoredProcedureTwo two;
@RequestMapping(path="/outpara")
public Object outt() {
	return two.storedProcedureOut();
	
}

@Autowired
private StoredProcedureTwo sp;

@RequestMapping(path="/inout")
public Object inout(@RequestParam ("age") int a) {
	return sp.storedProcedureinOut(a);
}


@Autowired
private StoredProcedureTwo tw;

@RequestMapping(path="/bmnk")
public char asd(@RequestParam("gender") int a) {
	return tw.queryQuery(a);
}
}

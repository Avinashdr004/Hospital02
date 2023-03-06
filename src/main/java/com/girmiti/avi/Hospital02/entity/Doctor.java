package com.girmiti.avi.Hospital02.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQueries({
@NamedStoredProcedureQuery(name="abcd",procedureName = "new_age_procedure"),

@NamedStoredProcedureQuery(name="efg",procedureName ="new_gender_procedure",
parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "var",type =Character.class)}),

@NamedStoredProcedureQuery(name="hij",procedureName = "new_out_procedure",parameters =
{@StoredProcedureParameter(mode = ParameterMode.OUT,name = "op",type = Integer.class)}),

@NamedStoredProcedureQuery(name="klm",procedureName = "new_inout_procedure",parameters = 
{@StoredProcedureParameter(mode = ParameterMode.INOUT,name = "io",type = Integer.class)})

})
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

	private int did;

	private String dname;
	
	private  char gender;
	
	private int age;
	
	private long mob;
	
	private  String password;

	public Doctor() {
		super();
	}

	public Doctor(int did, String dname, char gender, int age, long mob, String password) {
		super();
		this.did = did;
		this.dname = dname;
		this.gender = gender;
		this.age = age;
		this.mob = mob;
		this.password = password;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}
	

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

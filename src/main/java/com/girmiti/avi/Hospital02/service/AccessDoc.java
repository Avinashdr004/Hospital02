package com.girmiti.avi.Hospital02.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.girmiti.avi.Hospital02.entity.Doctor;

@Service
public interface AccessDoc {
 public Optional<Doctor> accessDoc(int id);
}

package com.example.Patient_backend.dao;

import com.example.Patient_backend.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface Patientdao extends CrudRepository<Patient, Integer> {
}

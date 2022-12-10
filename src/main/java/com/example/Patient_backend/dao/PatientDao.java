package com.example.Patient_backend.dao;

//import com.example.PatientApp.model.Patient;
import com.example.Patient_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {
    @Query(value = "SELECT `id`, `address`, `dateofappointment`, `doctorname`, `image`, `name`, `phone` FROM `patients` WHERE `name`= :name", nativeQuery = true)
    List<Patient> SearchEmployee(@Param("name") String name);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`= :id", nativeQuery = true)
    void DeleteEmployee(@Param("id") Integer id);
}
package com.example.Patient_backend.controller;
import com.example.Patient_backend.dao.Patientdao;
import com.example.Patient_backend.model.Patient;
//import com.example.patient.model.Patientmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
//import com.example.patient.dao.Patientdao;

import java.util.HashMap;
import java.util.List;
@RestController

public class PatientController {
    @Autowired
    private Patientdao dao;
    @CrossOrigin(origins ="*")
    @GetMapping("/viewall")
    public List<Patient> Viewall()
    {
        return (List<Patient>) dao.findAll();
    }
    @CrossOrigin(origins ="*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String > Add(@RequestBody Patient p)
    {
        System.out.println(p.getIds());
        System.out.println(p.getUsername().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getNumber().toString());
        System.out.println(p.getDate().toString());
        System.out.println(p.getImage().toString());
        System.out.println(p.getDoctor().toString());
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status" ,"success");
       return map;
    }
}


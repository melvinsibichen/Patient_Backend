package com.example.Patient_backend.controller;

//import com.example.PatientApp.dao.PatientDao;
//import com.example.PatientApp.model.Patient;
import com.example.Patient_backend.dao.PatientDao;
import com.example.Patient_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Patient> ViewPatients(){
        return (List<Patient>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", produces = "application/json", consumes = "application/json")
    public String AddPatient(@RequestBody Patient p) {
        System.out.println(p);
        //dao.save(p);
        dao.save(p);
        return "success";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/search", consumes = "application/json", produces = "application/json")
    public List<Patient> SearchEmployee(@RequestBody Patient e){
        return (List<Patient>) dao.SearchEmployee(e.getName());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", produces = "application/json", consumes = "application/json")
    public HashMap<String, String> DeletePatient(@RequestBody Patient p) {
        String id = String.valueOf(p.getId());
        dao.DeleteEmployee(p.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
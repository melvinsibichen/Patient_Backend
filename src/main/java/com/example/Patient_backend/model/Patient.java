package com.example.Patient_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue()
    private int id;
    private String name;
    private String image;
    private String address;
    private String phone;
    private String dateofappointment;
    private String doctorname;

    public Patient() {
    }

    public Patient(int id, String name, String image, String address, String phone, String dateofappointment, String doctorname) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.address = address;
        this.phone = phone;
        this.dateofappointment = dateofappointment;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateofappointment() {
        return dateofappointment;
    }

    public void setDateofappointment(String dateofappointment) {
        this.dateofappointment = dateofappointment;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}

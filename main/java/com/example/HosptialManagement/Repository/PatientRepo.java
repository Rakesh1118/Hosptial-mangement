package com.example.HosptialManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HosptialManagement.Entitys.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{
      
}


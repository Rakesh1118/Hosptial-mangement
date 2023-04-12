package com.example.HosptialManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.HosptialManagement.Entitys.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}


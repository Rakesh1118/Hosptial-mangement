package com.example.HosptialManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.HosptialManagement.Entitys.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}

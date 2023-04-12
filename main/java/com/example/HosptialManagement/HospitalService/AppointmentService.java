package com.example.HosptialManagement.HospitalService;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;


import com.example.HosptialManagement.Entitys.Appointment;
import com.example.HosptialManagement.Repository.AppointmentRepo;



public class AppointmentService {
	
	@Autowired
	private AppointmentRepo ARepo;
	
	public  List<Appointment> FindallAppointment()
	{
		return ARepo.findAll();	
	}
	
	public Appointment SaveAppointment(Appointment appointment)
	
	{
		return ARepo.save(appointment);
	}
	
   public Appointment updateAppointment(Appointment appointment)
	
	{
		return ARepo.save(appointment);
	}
    public void DeleteByID(int id)
    {
    	ARepo.deleteById(id);
    }
   
}



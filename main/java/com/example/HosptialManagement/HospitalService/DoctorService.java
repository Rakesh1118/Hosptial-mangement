package com.example.HosptialManagement.HospitalService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HosptialManagement.Entitys.Doctor;
import com.example.HosptialManagement.Repository.DoctorRepo;
@Service
public class DoctorService {

	@Autowired 
	private DoctorRepo DRepo;
	
	public List<Doctor> FindallDoctor()
	{
		return DRepo.findAll();	
	}
	
	public Doctor SaveDoctor(Doctor doctor)
	
	{  
		return DRepo.save(doctor);
	}
	
   public Doctor updateDoctor(Doctor doctor)
	
	{
		return DRepo.save(doctor);
	}
    public void DeleteByID(int id)
    {
    	DRepo.deleteById(id);
    }

	    
	
}

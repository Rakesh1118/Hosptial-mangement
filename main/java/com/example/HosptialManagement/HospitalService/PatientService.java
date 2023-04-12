package com.example.HosptialManagement.HospitalService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HosptialManagement.Entitys.Patient;
import com.example.HosptialManagement.Repository.PatientRepo;

@Service
public class PatientService {

	@Autowired 
	private PatientRepo PRepo;
	
	public List<Patient> FindallPatient()
	{ 
		return PRepo.findAll();	
	}
	
	public Patient SavePatient(Patient patient)
	
	{
		return PRepo.save(patient);
	}
	
   public Patient updatepatient(Patient patient)
	
	{
		return PRepo.save(patient);
	}
    public void DeleteByID(int id)
    {
    	PRepo.deleteById(id);
    }

}

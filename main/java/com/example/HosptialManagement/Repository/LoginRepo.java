package com.example.HosptialManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import com.example.HosptialManagement.Entitys.Login;


public interface LoginRepo extends JpaRepository<Login, Integer>{

	@Query("select l from Login l where l.username=?1 and l.password=?2 ")
      Login verifyuser(String username, String password);


	
}

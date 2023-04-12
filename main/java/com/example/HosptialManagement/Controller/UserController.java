package com.example.HosptialManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.HosptialManagement.Entitys.Users;
import com.example.HosptialManagement.Repository.UserRepo;

@Controller
public class UserController {

	@Autowired
	private UserRepo UserRP;
	
	@PostMapping("/user")
	public Users User(@RequestBody Users u) {
	
		return UserRP.save(u);
	}}
	

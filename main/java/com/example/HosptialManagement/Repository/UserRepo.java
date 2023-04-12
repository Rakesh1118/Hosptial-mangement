package com.example.HosptialManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HosptialManagement.Entitys.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{

}

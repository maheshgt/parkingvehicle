package com.vehicle.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.parking.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}

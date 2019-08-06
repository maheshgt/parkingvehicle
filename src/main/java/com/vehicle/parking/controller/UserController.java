package com.vehicle.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.parking.dto.UserDto;
import com.vehicle.parking.entity.User;
import com.vehicle.parking.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public ResponseEntity<User> userRegistration(UserDto userDto){
		return new ResponseEntity<User>(userService.register(userDto),HttpStatus.OK);
	}
	
	
}

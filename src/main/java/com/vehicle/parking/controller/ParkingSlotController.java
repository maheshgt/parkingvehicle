package com.vehicle.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.parking.service.ParkingSlotService;
import com.vehicle.parking.service.UserService;

@RestController
@RequestMapping("/admin")
public class ParkingSlotController {
	@Autowired
	ParkingSlotService parkingSlotService;

	@Autowired
	UserService userService;

	@PostMapping("/assignSlot")
	public String assignSlots() {
		return parkingSlotService.assignSlotList();
	}
	
	public String assignDailySlots() {
		return parkingSlotService.assignDailySlot();
	}

}

package com.vehicle.parking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.parking.entity.ParkingSlot;
import com.vehicle.parking.entity.User;
import com.vehicle.parking.repository.ParkingSlotRepo;
import com.vehicle.parking.repository.UserRepo;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	ParkingSlotRepo parkingSlotRepo;
	
	User user = null;
	@Override
	public String assignSlotList() {
		List<User> list = userRepo.findAll();
		user = new User();
		for(User user :list) {
			if(user.getDesignation().equalsIgnoreCase("senior") || user.getDesignation().equalsIgnoreCase("official")) {
				ParkingSlot	parkingSlot = new ParkingSlot();
				parkingSlot.setUser(user);
				parkingSlot.setSlotId(0);
				parkingSlot.setFloor("first floor");
				parkingSlotRepo.save(parkingSlot);
			}
		}
		return "slots alloted successfully";
	}
	@Override
	public String assignDailySlot() {
		int arr[] = new int[5];
		List<ParkingSlot> list = parkingSlotRepo.findAll();
		return null;
	}

}

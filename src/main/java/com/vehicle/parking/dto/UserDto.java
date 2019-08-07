package com.vehicle.parking.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
	
	
	private int id;
	
	private String name;
	
	private float experience;
	
	private String designation;
	
	//private LocalDate doj;
	
	private Long mobileno;
	
	private String address;
}

package com.vehicle.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ParkingSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SlotId;
	
	private int status;
	
	private String floor;
	
	@Column(columnDefinition = "int default 0")
	private int days;
	
	@OneToOne
	User user;
}

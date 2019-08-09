package com.vehicle.parking.exception;

public class VehicleParkingException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public VehicleParkingException(String errorMessage, Throwable err) {
		super(errorMessage);
	}
}

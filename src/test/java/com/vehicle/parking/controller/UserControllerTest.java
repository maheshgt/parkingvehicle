package com.vehicle.parking.controller;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.vehicle.parking.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	
	@InjectMocks
	UserController userController;
	
	@Mock
	UserServiceImpl userServiceImpl;

	
	@Autowired
	MockMvc mockMvc;
	
	@Before
	    public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);
	    }

	
	@Test
	public void testGetAllUsers() throws Exception {
		
	
		
	}

}

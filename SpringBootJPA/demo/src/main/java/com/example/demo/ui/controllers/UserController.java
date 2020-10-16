package com.example.demo.ui.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.shared.dto.UserDto;
import com.example.demo.ui.modal.response.UserRest;
import com.example.demo.ui.model.request.UserDetailsRequestModel;


@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser()
	{
		return "getUser called";
	}
	
	@PostMapping
	public UserRest setUser(@RequestBody UserDetailsRequestModel userDetails)
	{
		//create User restObject
		UserRest returnObj=new UserRest();
		
		//Create and Populate the dto object
		UserDto dtoObj=new UserDto();
		BeanUtils.copyProperties(userDetails, dtoObj);
		
		//call the service class and create new DTO
		UserDto createdUser=userService.createUser(dtoObj);
		
		//populate the UserRestObject and return
		BeanUtils.copyProperties(createdUser, returnObj);
		return returnObj;
	}
	
	@PutMapping
	public String UpdateUser()
	{
		return "update user called";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "deleteUser called";
	}

}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	SampleService service;

	@PostMapping("/add")
	public ResponseDTO addUser(@RequestBody UserDTO user) {
		service.addUser(user);
		ResponseDTO response = new ResponseDTO();
		response.setMessage("success");
		return response;
	}

	@GetMapping("/get/{user}")
	public UserDTO getUser(@PathVariable("user") String user) {
		return service.getUser(user);
	}

	@GetMapping("greet/{name}/{city}")
	public String greet(@PathVariable("name") String name, @PathVariable("city") String city) 
	{
		return "hello " + name + " from " + city;
	}
}

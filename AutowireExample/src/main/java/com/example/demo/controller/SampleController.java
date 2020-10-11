package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.SampleService;

@RestController
public class SampleController 
{
	@Autowired
	SampleService service;
	
	@PostMapping("/add")
	public ResponseDTO addPerson(@RequestBody PersonDTO person)
	{
		service.addPerson(person);
		ResponseDTO response=new ResponseDTO();
		response.setSuccess("true");
		return response;
	}
	
	@GetMapping("/getPersonList")
	public ResponseDTO getPersonList()
	{
		ResponseDTO responseDTO=new ResponseDTO();
		responseDTO.setPersonlist(service.getPersonList());
		responseDTO.setSuccess("true");
		return responseDTO;
	}

}

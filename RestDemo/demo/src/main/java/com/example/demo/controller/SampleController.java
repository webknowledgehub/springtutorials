package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Person;
import com.example.demo.dto.ResponseDTO;

@RestController
public class SampleController {
	
	@PostMapping("/greeting")
	public ResponseDTO greet(@RequestBody Person person)
	{
		ResponseDTO response=new ResponseDTO();
		String message="Hello "+person.getName()+" from "+person.getCity();
		response.setMessage(message);
		response.setSuccess("true");
		return response;
	}

}

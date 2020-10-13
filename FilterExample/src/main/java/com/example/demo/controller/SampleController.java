package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	Logger LOG=LoggerFactory.getLogger(SampleController.class);
	
	@GetMapping("/sample")
	public String sample()
	{
		LOG.info("inside controller");
		return "send data";
	}
	
	@GetMapping("/blockedsample")
	public String blockedsample()
	{
		LOG.info("inside blockedsample");
		return "send data";
	}

}

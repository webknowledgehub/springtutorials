package com.example.demo.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.UserDTO;

@Configuration
public class SampleConfiguration 
{
	
	@Bean
	public ArrayList<UserDTO> getArrayList()
	{
		return new ArrayList<UserDTO>();
	}

}

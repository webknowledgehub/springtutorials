package com.example.demo.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.dto.PersonDTO;

@Configuration
public class SampleConfiguration 
{
	@Bean
	public ArrayList<PersonDTO> getPersonList()
	{
		return new ArrayList<PersonDTO>();
	}

}

package com.example.demo.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.PersonDTO;

@Service
public class SampleService 
{
	@Autowired
	public ArrayList<PersonDTO> list;
	
	public void addPerson(PersonDTO person)
	{
		list.add(person);
	}
	
	public ArrayList<PersonDTO> getPersonList()
	{
		return list;
	}
	

}

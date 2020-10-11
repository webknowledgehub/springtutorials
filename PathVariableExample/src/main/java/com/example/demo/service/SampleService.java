package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.UserDTO;

@Service
public class SampleService 
{
	@Autowired
	public ArrayList<UserDTO> list;
	
	public void addUser(UserDTO user)
	{
		list.add(user);
	}
	
	public UserDTO getUser(String username)
	{
		Iterator<UserDTO> iter=list.iterator();
		while(iter.hasNext())
		{
			UserDTO user=iter.next();
			if(user.getUsername().equals(username))
			{
				return user;
			}
		}
		return null;
	}
}

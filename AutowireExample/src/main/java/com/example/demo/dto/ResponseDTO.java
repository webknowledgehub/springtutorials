package com.example.demo.dto;

import java.util.List;

public class ResponseDTO 
{
	List<PersonDTO> personlist;
	String success;
	
	public List<PersonDTO> getPersonlist() {
		return personlist;
	}
	public void setPersonlist(List<PersonDTO> personlist) {
		this.personlist = personlist;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}

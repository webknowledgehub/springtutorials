package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	
	@GetMapping("/url/greet")
	public String greetUser(@RequestParam String user, @RequestParam(name= "city") String usercity)
	{
		return "Welcome "+user+" from "+usercity+" !";
	}
	
	@GetMapping("/sample/default")
	public String defaultParam(@RequestParam(defaultValue = "data") String key)
	{
		return "key : "+key;
	}
	
	@GetMapping("/sample/dynamic")
	public String dynamicParam(@RequestParam Map<String, String> params)
	{
		return "List of all Parameters : "+params.entrySet();
	}
	
	@GetMapping("/sample/list")
	public String multipleValues(@RequestParam List<String> id)
	{
		return "List of all values passed in id : "+id;
	}

}

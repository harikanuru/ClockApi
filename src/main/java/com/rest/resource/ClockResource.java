package com.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.service.ClockService;

@RestController
public class ClockResource {
	
	@Autowired
	ClockService clockService;

	@GetMapping("/getPopulation/{time}")
	public @ResponseBody Object getPopulation(@PathVariable String time) {
		

		Object cityPopulation = clockService.getTime(time);
		
		return cityPopulation;
	}
}

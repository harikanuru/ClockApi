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

	@GetMapping("/getTime/{time}")
	public @ResponseBody Object getTime(@PathVariable String time) {
		

		Object timeInWords = clockService.getTime(time);
		
		return timeInWords;
	}
}

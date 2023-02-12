package com.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.rest.service.ClockService;
import com.rest.utils.Constants;

@RunWith(MockitoJUnitRunner.class)
public class ClockResource {



	@InjectMocks
	com.rest.resource.ClockResource clockResource;
	
	@Mock
	ClockService clockService;
	
	@Test
	public void testTime() {
		
		Mockito.when(clockService.getTime("00:00")).thenReturn(Constants.MID_NIGHT);
		String res = (String) clockResource.getTime("00:00");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( Constants.MID_NIGHT , res);
		System.out.println("Time Res "+ res);
	}
}

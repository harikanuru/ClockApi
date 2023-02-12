package com.rest.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.rest.service.impl.ClockServiceImpl;
import com.rest.utils.Constants;

/*Run with Juni4*/

@RunWith(MockitoJUnitRunner.class)
public class ClockServiceTest {

	@InjectMocks
	ClockServiceImpl clockService;
	
	@Test
	public void testTime() {
		String res = clockService.getTime("00:00");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( Constants.MID_NIGHT , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime2() {
		String res = clockService.getTime("12:00");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( Constants.MID_DAY , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime3() {
		String res = clockService.getTime("10:24");
		
		Assert.assertNotNull(res);
		Assert.assertEquals("It's TEN TWENTY FOUR" , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime4() {
		String res = clockService.getTime("01:24");
		
		Assert.assertNotNull(res);
		Assert.assertEquals("It's ONE TWENTY FOUR" , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime5() {
		String res = clockService.getTime("01:04");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( "It's ONE FOUR", res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime7() {
		String res = clockService.getTime("21:20");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( "It's TWENTY ONE TWENTY" , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime8() {
		String res = clockService.getTime("21:23");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( "It's TWENTY ONE TWENTY THREE" , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime9() {
		String res = clockService.getTime("21:00");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( "It's TWENTY ONE" , res);
		System.out.println("Time Res "+ res);
	}
	
	@Test
	public void testTime10() {
		String res = clockService.getTime("21:10");
		
		Assert.assertNotNull(res);
		Assert.assertEquals( "It's TWENTY ONE TEN" , res);
		System.out.println("Time Res "+ res);
	}
	
	
	
}

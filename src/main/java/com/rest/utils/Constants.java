package com.rest.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	public static String MID_NIGHT = "It's Midnight";
	
	public static String MID_DAY = "It's Midday";

	public static Map<String, String> numbers = new HashMap<String, String>() {
		{
			put("0", "ZERO");
			put("1", "ONE");
			put("2", "TWO");
			put("3", "THREE");
			put("4", "FOUR");
			put("5", "FIVE");
			put("6", "SIX");
			put("7", "SEVEN");
			put("8", "EIGHT");
			put("9", "NINE");
		}
	};

	public static Map<String, String> teensMap = new HashMap<String, String>() {
		{
			put("10", "TEN");
			put("11", "ELEVEN");
			put("12", "TWELVE");
			put("13", "THIRTEEN");
			put("14", "FOURTEEN");
			put("15", "FIFTEEN");
			put("16", "SIXTEEN");
			put("17", "SEVENTEEN");
			put("18", "EIGHTTEEN");
			put("19", "NINETEEN");
		}
	};

	public static Map<String, String> tensMap = new HashMap<String, String>() {
		{
			put("1", "TEN");
			put("2", "TWENTY");
			put("3", "THIRTY");
			put("4", "FOURTY");
			put("5", "FIFTY");
			put("6", "SIXTY");
		}
	};
}

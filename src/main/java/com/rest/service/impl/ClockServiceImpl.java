package com.rest.service.impl;

import org.springframework.stereotype.Service;

import com.rest.service.ClockService;
import com.rest.utils.Constants;

@Service
public class ClockServiceImpl implements ClockService {

	@Override
	public String getTime(String time) {

		String timeString = "";

		if (time.contentEquals("00:00"))
			timeString = Constants.MID_NIGHT;
		else if (time.contentEquals("12:00"))
			timeString = Constants.MID_DAY;
		else
			timeString = getTimeInwords(time);

		return timeString;

	}

	public String getTimeInwords(String time) {
		String[] times = time.split("");

		String timeString = "";
		if (times[0].equals("0")) {
			timeString = (String) Constants.numbers.get(times[1]);
		} else if (times[0].equals("1")) {
			timeString = (String) Constants.teensMap.get(times[0] + times[1]);
		} else {
			timeString = (String) Constants.tensMap.get(times[0]) + " " + (String) Constants.numbers.get(times[1]);
		}
		if (times[3].equals("0") && times[4].equals("0")) {
			timeString = "It's " +timeString;
		} else if (times[3].equals("0") ) {
			timeString = "It's " +timeString + " " + (String) Constants.numbers.get(times[4]);
		} else if (times[3].equals("1")) {
			timeString = "It's " + timeString + " " + (String) Constants.teensMap.get(times[3] + times[4]);
		} else if(!times[3].equals("1") && times[4].equals("0")){
			timeString = "It's " + timeString + " " + (String) Constants.tensMap.get(times[3]) ;
		}else {
			timeString = "It's " + timeString + " " + (String) Constants.tensMap.get(times[3]) + " "
					+ (String) Constants.numbers.get(times[4]);
		}

		return timeString;
	}

}

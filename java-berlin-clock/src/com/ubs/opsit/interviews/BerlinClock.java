package com.ubs.opsit.interviews;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.ubs.opsit.exception.InvalidTimeException;
import com.ubs.opsit.time.CalculatedBerlinTime;
import com.ubs.opsit.time.Hours;
import com.ubs.opsit.time.Minutes;
import com.ubs.opsit.time.Seconds;

public class BerlinClock implements TimeConverter {

	private Hours hours;
	private Minutes minutes;
	private Seconds seconds;
	
	@Override
	public CalculatedBerlinTime convertTime(String inputTime) throws InvalidTimeException {
		CalculatedBerlinTime timeConverter = new CalculatedBerlinTime();

		if (validateTime(inputTime)) {

			seconds = new Seconds();
			timeConverter.setBerlinSecond(seconds.calculatedString(Integer.parseInt(inputTime.split(":")[2])));

			hours = new Hours();
			timeConverter.setBerlinHour(hours.calculatedString(Integer.parseInt(inputTime.split(":")[0])));

			minutes = new Minutes();
			timeConverter.setBerlinMinute(minutes.calculatedString(Integer.parseInt(inputTime.split(":")[1])));

		} else
			throw new InvalidTimeException("Enter proper time , in given format");

		return timeConverter;

	}

	//TO VALIDATE INPUT STRING
	private boolean validateTime(String inputTime) {
		if ((Integer.parseInt(inputTime.split(":")[0]) >= 1 && Integer.parseInt(inputTime.split(":")[0]) <= 24)
				&& (Integer.parseInt(inputTime.split(":")[1]) >= 0 && Integer.parseInt(inputTime.split(":")[1]) <= 59)
				&&(Integer.parseInt(inputTime.split(":")[2]) >= 0 && Integer.parseInt(inputTime.split(":")[2]) <= 59))
			return true;

		return false;
	}


}

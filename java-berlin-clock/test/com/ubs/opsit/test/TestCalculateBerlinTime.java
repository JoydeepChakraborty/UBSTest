package com.ubs.opsit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ubs.opsit.exception.InvalidTimeException;
import com.ubs.opsit.interviews.BerlinClock;
import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.time.CalculatedBerlinTime;

public class TestCalculateBerlinTime {

	private TimeConverter convert=new BerlinClock();
	
	@Test
	public void testTime1() throws InvalidTimeException {

		CalculatedBerlinTime calculatedTime=convert.convertTime("24:00:00");
		assertEquals("RRRR\nRRRR", calculatedTime.getBerlinHour());
		assertEquals("OOOOOOOOOOOO\nOOOO", calculatedTime.getBerlinMinute());
		assertEquals("Y", calculatedTime.getBerlinSecond());
	}
	
	@Test
	public void testTime2() throws InvalidTimeException {

		CalculatedBerlinTime calculatedTime=convert.convertTime("13:17:01");
		assertEquals("RROO\nRRRO", calculatedTime.getBerlinHour());
		assertEquals("YYROOOOOOOOO\nYYOO", calculatedTime.getBerlinMinute());
		assertEquals("O", calculatedTime.getBerlinSecond());
		
	
	}
	
	@Test
	public void testTime3() throws InvalidTimeException {

		CalculatedBerlinTime calculatedTime=convert.convertTime("23:59:59");
		assertEquals("RRRR\nRRRO", calculatedTime.getBerlinHour());
		assertEquals("YYRYYRYYRYYO\nYYYY", calculatedTime.getBerlinMinute());
		assertEquals("O", calculatedTime.getBerlinSecond());
		
	
	}
	
	


}

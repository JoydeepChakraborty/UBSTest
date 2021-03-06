package com.ubs.opsit.execute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.ubs.opsit.exception.InvalidTimeException;
import com.ubs.opsit.interviews.BerlinClock;
import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.time.CalculatedBerlinTime;

/**
 * CLASS TO EXECUTE BERLIN CLOCK CONVERTER
 * @author Joy
 *
 */
public class CalculateTime {
	
	public static void main(String args[]) throws InvalidTimeException{
		//INSTATIATING BERLING CLOCK
		TimeConverter convert=new BerlinClock();		
		Scanner reader=new Scanner(System.in);
		
		//READING USER INPUT
		System.out.println("Enter the time (hh:mm:ss)");
		String enteredTime=reader.next();
		//CALCULATING BERLIN TIME
		CalculatedBerlinTime calculatedTime=convert.convertTime(enteredTime);
		//DISPLAYING OUTPUT
		System.out.println(calculatedTime.getBerlinSecond());
		System.out.println(calculatedTime.getBerlinHour());
		System.out.println(calculatedTime.getBerlinMinute());
	}
	

}

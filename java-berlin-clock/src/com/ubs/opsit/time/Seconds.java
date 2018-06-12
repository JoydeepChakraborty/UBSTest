package com.ubs.opsit.time;

public class Seconds  implements Time{

	/**
	 * TO CALCULATE SECOND REPRESENTATION
	 */
	@Override
	public String calculatedString(int time) {
		if(time%2==0)
			return "Y";
		else
			return "O";
	}

}

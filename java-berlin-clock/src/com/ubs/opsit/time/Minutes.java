package com.ubs.opsit.time;

public class Minutes implements Time{

	/**
	 * CALCULATE MINUTE REPRESENTATION OF BERLIN CLOCK
	 */
	@Override
	public String calculatedString(int time) {


		String evaluatedFirstRow = "";
		String evaluatedSecondRow = "";
		int SUBTRACTING_ELEMENT = 1;
		if (time > 15) {
			SUBTRACTING_ELEMENT = 15;
		}
		else if(time >=5 && time <15){
			SUBTRACTING_ELEMENT = 5;
		}

		while (time > 0) {
			if (time >= 15) {
				evaluatedFirstRow += "YYR";
			} 
			else if(time >=5 && time <15){
				SUBTRACTING_ELEMENT = 5;
				evaluatedFirstRow+="Y";
			}
			else {
				
				SUBTRACTING_ELEMENT = 1;
				evaluatedSecondRow += "Y";
			}

			time = time - SUBTRACTING_ELEMENT;
		}
		
	
		return printMinutes(evaluatedFirstRow,(12-evaluatedFirstRow.length()),evaluatedSecondRow,(4-evaluatedSecondRow.length()));
	}
	
	/**
	 * TO ADD REMAINING O'S
	 * @param evaluatedFirstRow
	 * @param firstRowLength
	 * @param evaluatedSecondRow
	 * @param secondRowLength
	 */
	private String printMinutes(String evaluatedFirstRow, int firstRowLength, String evaluatedSecondRow,
			int secondRowLength) {
		while (firstRowLength != 0) {
			evaluatedFirstRow += "O";
			--firstRowLength;
		}
		while (secondRowLength != 0) {
			evaluatedSecondRow += "O";
			--secondRowLength;
		}

		return evaluatedFirstRow+"\n"+evaluatedSecondRow;
	}

}
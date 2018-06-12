package com.ubs.opsit.time;

public class Hours implements Time {

	
	/**
	 * CALULCATING HOUR REPRESENTATION OF BERLINT CLOCK
	 */
	@Override
	public String calculatedString(int time) {

		String evaluatedFirstRow = "";
		String evaluatedSecondRow = "";
		int SUBTRACTING_ELEMENT = 1;
		if (time > 5) {
			SUBTRACTING_ELEMENT = 5;
		}
		// CALCULATING BERLIN HOUR
		while (time > 0) {
			if (time >= 5) {
				evaluatedFirstRow += "R";
			} else {
				SUBTRACTING_ELEMENT = 1;
				evaluatedSecondRow += "R";
			}
			time = time - SUBTRACTING_ELEMENT;
		}
		
		
		return printHour(evaluatedFirstRow,(4-evaluatedFirstRow.length()),evaluatedSecondRow,(4-evaluatedSecondRow.length()));
	}
	/**
	 * To add O's to remaining time
	 * @param evaluatedFirstRow
	 * @param firstRowLength
	 * @param evaluatedSecondRow
	 * @param secondRowLength
	 */
	private String printHour(String evaluatedFirstRow, int firstRowLength, String evaluatedSecondRow,
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

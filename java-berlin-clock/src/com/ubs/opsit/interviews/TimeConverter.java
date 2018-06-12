package com.ubs.opsit.interviews;

import com.ubs.opsit.exception.InvalidTimeException;
import com.ubs.opsit.time.CalculatedBerlinTime;

public interface TimeConverter {

	/**
	 * Calculate berling time
	 * @param aTime
	 * @return
	 * @throws InvalidTimeException
	 */
    public CalculatedBerlinTime convertTime(String aTime)  throws InvalidTimeException;

}

/**  
 * Fare Table Data Access Object
 * 
 * @version 1.0z Build 1000 Feb 20, 2015.
 */
package com.example.taxiservice;

import java.util.Date;

public class FareTable {

	private Date startDate = null;
	private float baseFare = 0;
	private float farePerKM = 0;
	private float fareAdditionalPassenger = 0;

	public FareTable(Date startDate, float baseFare, float farePerKM, float fareAdditionalPassenger) {		
		this.startDate = startDate;
		this.baseFare = baseFare;
		this.farePerKM = farePerKM;
		this.fareAdditionalPassenger = fareAdditionalPassenger;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public float getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(float baseFare) {
		this.baseFare = baseFare;
	}

	public float getFarePerKM() {
		return farePerKM;
	}

	public void setFarePerKM(float farePerKM) {
		this.farePerKM = farePerKM;
	}

	public float getFareAdditionalPassenger() {
		return fareAdditionalPassenger;
	}

	public void setFareAdditionalPassenger(float fareAdditionalPassenger) {
		this.fareAdditionalPassenger = fareAdditionalPassenger;
	}


}

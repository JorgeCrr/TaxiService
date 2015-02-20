/**  
 * Taxi Data Access Object
 * 
 * @version 1.0z Build 1000 Feb 20, 2015.
 */

package com.example.taxiservice;

public class Taxi {

	private String registrationNumber = "";
	private String driverName = "";

	public Taxi() {
		throw new UnsupportedOperationException();
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
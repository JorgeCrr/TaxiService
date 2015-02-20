/**  
 * Journey Data Access Object
 * 
 * @version 1.0z Build 1000 Feb 20, 2015.
 */

package com.example.taxiservice;

import java.util.Date;

public class Journey {

	private int journeyId = 0;
	private Date date;
	private Taxi taxi = null;
	private Destination destination = null;
	private short noOfPassengers = 0;

	public Journey() {
		throw new UnsupportedOperationException();
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public short getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(short noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

}
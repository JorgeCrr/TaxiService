/**  
 * Journey Data Access Object
 * 
 * @version 1.0z Build 1000 Feb 20, 2015.
 */

package com.example.taxiservice;

import java.util.Date;
import java.util.TreeMap;

public class Journey implements Comparable<Journey>{

	private int journeyId = 0;
	private Date date;
	private Taxi taxi = null;
	private Destination destination = null;
	private short noOfPassengers = 0;
	private float cost = 0.0F;

	public Journey(int journeyId, Date date, short noOfPassengers) {
		this.journeyId = journeyId;
		this.date = date;
		this.noOfPassengers = noOfPassengers;
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

	public float getCost() {			
		return cost;				
	}

	public void setCost(float cost)
	{
		this.cost = cost;
	}
	
	public float calculateCost(TreeMap<Date, FareTable> fareTable) {
		
		for(FareTable fare : fareTable.values())
		{
			if(date.after(fare.getStartDate()))
			{
				cost = (fare.getBaseFare() + (float)Math.ceil(destination.getDistance() - 1) * fare.getFarePerKM()) * (100 + (noOfPassengers - 1) * fare.getFareAdditionalPassenger())/100;
				break;
			}
		}
		return cost;
	}

	@Override
	public int compareTo(Journey journey2) {
		// TODO Auto-generated method stub
		return (int) (this.cost - journey2.getCost());
	}
	

}
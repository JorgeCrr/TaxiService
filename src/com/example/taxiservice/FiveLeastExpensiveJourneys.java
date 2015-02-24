package com.example.taxiservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;

public class FiveLeastExpensiveJourneys{	
	
	private int numberOfRecords = 0;
	
	public int getNumberOfRecords() {
		return numberOfRecords;
	}

	public FiveLeastExpensiveJourneys(int numberOfRecords)
	{
		this.numberOfRecords = numberOfRecords;
	}
	
	public void generateReport(ArrayList<Journey> journeys) {		
		
		Collections.sort(journeys);
		System.out.println("Five least expensive Journeys 2015");
		for(Journey journey : journeys.subList(0, numberOfRecords))
		{			
			System.out.println(journey.getTaxi().getRegistrationNumber() + "\t" + journey.getDestination().getName() + "\t" + 
					journey.getDestination().getDistance() + "\t" + journey.getNoOfPassengers() + "\t" + journey.getCost());
		}		
	}

}

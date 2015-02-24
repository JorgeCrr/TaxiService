package com.example.taxiservice;

import java.util.ArrayList;
import java.util.Collections;


public class FiveMostExpensiveJourneys{

private int numberOfRecords = 0;
	
	FiveMostExpensiveJourneys(int numberOfRecords)
	{
		this.numberOfRecords = numberOfRecords;
	}
	
	public void generateReport(ArrayList<Journey> journeys) {		
		
		Collections.sort(journeys);		
		System.out.println("Five most expensive Journeys in 2015");
		for(Journey journey : journeys.subList(0, numberOfRecords))
		{			
			System.out.println(journey.getTaxi().getRegistrationNumber() + "\t" + journey.getDestination().getName() + "\t" + 
					journey.getDestination().getDistance() + "\t" + journey.getNoOfPassengers() + "\t" + journey.getCost());
		}		
	}

}

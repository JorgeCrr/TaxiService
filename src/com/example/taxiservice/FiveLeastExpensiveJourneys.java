package com.example.taxiservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.TreeMap;

public class FiveLeastExpensiveJourneys{		
	
	public void generateReport(ArrayList<Journey> journeys) {		
		
		Collections.sort(journeys);
		System.out.println("Five least expensive Journeys 2015");
		for(Journey journey : journeys)
		{			
			System.out.println(journey.getTaxi().getRegistrationNumber() + "\t" + journey.getDestination().getName() + "\t" + 
					journey.getDestination().getDistance() + "\t" + journey.getNoOfPassengers() + "\t" + journey.getCost());
		}		
	}

}

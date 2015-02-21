package com.example.taxiservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class TaxiService {

	public static void main(String[] args) {
				
		// Initialise the data source type , text file in this case
		DataSource textFile = new DataSource();
		HashMap<String, Taxi>  taxiMap = textFile.loadTaxis();
		HashMap<String, Destination>  destinationMap = textFile.loadDestinations();
		TreeMap<Date, FareTable> fareTable = textFile.loadFareTable();
		ArrayList<Journey> journeys = textFile.loadJourneys(fareTable);
		
		// This is proof of concept for passing the in memory array list
		System.out.println(" ---------------------------");
		System.out.println("|  Places visited in 2014   |");
		System.out.println(" ---------------------------");		
		PlacesVisited2014 placesVisited2014 = new PlacesVisited2014();
		placesVisited2014.generateReport(new ArrayList<Destination> (destinationMap.values()));
		
		FiveLeastExpensiveJourneys least = new FiveLeastExpensiveJourneys();
		least.generateReport(journeys);
		
	}

}

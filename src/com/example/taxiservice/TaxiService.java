package com.example.taxiservice;

import java.util.ArrayList;

public class TaxiService {

	public static void main(String[] args) {
				
		// Initialise the data source type , text file in this case
		DataSource textFile = new DataSource();
		ArrayList<Destination>  destinationlist = textFile.loadDestinations();
		
		
		// This is proof of concept for passing the in memory array list
		System.out.println(" ---------------------------");
		System.out.println("|  Places visited in 2014   |");
		System.out.println(" ---------------------------");		
		PlacesVisited2014 placesVisited2014 = new PlacesVisited2014(destinationlist);
		placesVisited2014.generateReport(destinationlist);
		
	}

}

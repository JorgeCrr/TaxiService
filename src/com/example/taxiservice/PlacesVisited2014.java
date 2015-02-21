package com.example.taxiservice;

import java.util.ArrayList;

public class PlacesVisited2014{
	
//	ArrayList<Destination> destinations = new ArrayList<Destination>();
	
	public PlacesVisited2014(ArrayList<Destination> destinations)
	{
//		this.destinations=destinations;
	}
	
	public void generateReport(ArrayList<Destination> destinationlist) {
		// here we need to do the formating logic and not in list details
		
		StringBuffer allEntries = new StringBuffer();
		for (Destination details : destinationlist) {
			allEntries.append(details.getName());
			allEntries.append('\n');
		}
		System.out.println(allEntries.toString());
	}

}

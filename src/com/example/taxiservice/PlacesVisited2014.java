package com.example.taxiservice;

public class PlacesVisited2014{
	
	DestinationList destinations = new DestinationList();
	
	public PlacesVisited2014(DestinationList destinations)
	{
		this.destinations=destinations;
	}
	
	public void generateReport() {
		System.out.println(destinations.listDetails());
	}

}

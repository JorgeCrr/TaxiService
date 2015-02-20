package com.example.taxiservice;

import java.util.ArrayList;

public class DestinationList {

	private ArrayList<Destination> destinationList;

	public DestinationList() {
		destinationList = new ArrayList<Destination>();
	}

	public void addDestination(Destination destination) {
		destinationList.add(destination);
	}

	public String listDetails() {
		StringBuffer allEntries = new StringBuffer();
		for (Destination details : destinationList) {
			allEntries.append(details.getName());
			allEntries.append('\n');
		}
		return allEntries.toString();
	}

}

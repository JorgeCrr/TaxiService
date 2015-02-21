package com.example.taxiservice;


import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class DataSource {	
	 
	private HashMap<String, Destination> destinations;
	private HashMap<String, Taxi> taxis;
	
	public HashMap<String, Destination> loadDestinations() {
		destinations = new HashMap<String, Destination>();
		FileInputStream inputStream = null;
		Scanner sc = null;
		String data [] = new String[2];
		try {
		    inputStream = new FileInputStream("Data/Destinations.txt");
		    sc = new Scanner(inputStream, "UTF-8");
		    sc.nextLine();
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        data = line.split("\t");
		        Destination objDestination = new Destination(data[0], Float.parseFloat(data[1]));
		        destinations.put(objDestination.getName(), objDestination);
		    }		    
		}
		catch (IOException | NumberFormatException ex) {
			ex.printStackTrace();
		}		
		finally {
		    if (inputStream != null) {
		       	try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		return destinations;
	}
	
	public HashMap<String, Taxi> loadTaxis() {
		taxis = new HashMap<String, Taxi>();
		FileInputStream inputStream = null;
		Scanner sc = null;
		String data [] = new String[2];
		try {
		    inputStream = new FileInputStream("Data/Taxis.txt");
		    sc = new Scanner(inputStream, "UTF-8");
		    sc.nextLine();
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        data = line.split("\t");
		        Taxi taxi = new Taxi(data[0], data[1]);
		        taxis.put(taxi.getRegistrationNumber(), taxi);
		    }		    
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
		finally {
		    if (inputStream != null) {
		       	try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		return taxis;
	}
	
	public ArrayList<Journey> loadJourneys(TreeMap<Date, FareTable> fareTable) {
		ArrayList<Journey> journeys = new ArrayList<Journey>();		
		FileInputStream inputStream = null;
		Scanner sc = null;
		String data [] = new String[3];
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
		try {
		    inputStream = new FileInputStream("Data/Journeys2015.txt");
		    sc = new Scanner(inputStream, "UTF-8");
		    sc.nextLine();
		    while (sc.hasNextLine()) {		    	
		        String line = sc.nextLine();
		        data = line.split("\t");
		        Journey journey = new Journey(Integer.parseInt(data[0]), format.parse((data[1])), Short.parseShort(data[4]));
		        journey.setDestination(destinations.get(data[3]));
		        journey.setTaxi(taxis.get(data[2]));	
		        journey.setCost(journey.calculateCost(fareTable));
		        journeys.add(journey);
		    }		    
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			ex.printStackTrace();
		}		
		finally {
		    if (inputStream != null) {
		       	try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		return journeys;
	}

	public TreeMap<Date, FareTable> loadFareTable() {
		TreeMap<Date, FareTable> fareTable = new TreeMap<Date, FareTable>();
		FileInputStream inputStream = null;
		Scanner sc = null;
		String data [] = new String[4];
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
		try {
		    inputStream = new FileInputStream("Data/FareTable.txt");
		    sc = new Scanner(inputStream, "UTF-8");
		    sc.nextLine();
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        data = line.split("\t");
		        FareTable fare = new FareTable(format.parse((data[0])), Float.parseFloat(data[1]), Float.parseFloat(data[2]), Float.parseFloat(data[3]));
		        fareTable.put(fare.getStartDate(), fare);
		    }		    
		}
		catch (IOException | NumberFormatException | ParseException e) {
			e.printStackTrace();
		}		
		finally {
		    if (inputStream != null) {
		       	try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		return fareTable;
	}

}

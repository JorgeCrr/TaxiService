package com.example.taxiservice;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSource {

	private ArrayList<Destination> destinations;	
	 
	public ArrayList<Destination> loadDestinations() {
		destinations = new ArrayList<Destination>();
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
		        destinations.add(objDestination);
		    }
		    return destinations;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException nfex)
		{
			nfex.printStackTrace();
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
		return null;
	}

}

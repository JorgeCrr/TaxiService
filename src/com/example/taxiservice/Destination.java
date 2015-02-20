/**  
 * Destination Data Access Object
 *
 * @version 1.0z Build 1000 Feb 20, 2015.
 */

package com.example.taxiservice;

public class Destination {

	private String name = null;
	private float distance = 0;

	public Destination(String name, float distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

}
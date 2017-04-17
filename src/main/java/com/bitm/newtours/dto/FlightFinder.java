package com.bitm.newtours.dto;

public class FlightFinder {

	private String type;
	private String passengers;
	private String departingFrom;
	private String departingOnMonth;
	private String departingOnDate;
	private String arrivingIn;
	private String returningMonth;
	private String returningDate;
	private String serviceClass;
	private String airlinePreference;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	public String getDepartingOnMonth() {
		return departingOnMonth;
	}
	public void setDepartingOnMonth(String departingOnMonth) {
		this.departingOnMonth = departingOnMonth;
	}
	public String getDepartingOnDate() {
		return departingOnDate;
	}
	public void setDepartingOnDate(String departingOnDate) {
		this.departingOnDate = departingOnDate;
	}
	public String getArrivingIn() {
		return arrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}
	public String getReturningMonth() {
		return returningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public String getReturningDate() {
		return returningDate;
	}
	public void setReturningDate(String returningDate) {
		this.returningDate = returningDate;
	}
	public String getServiceClass() {
		return serviceClass;
	}
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	public String getAirlinePreference() {
		return airlinePreference;
	}
	public void setAirlinePreference(String airlinePreference) {
		this.airlinePreference = airlinePreference;
	}
	
	@Override
	public String toString() {
		return "FlightFinder [passengers=" + passengers + ", departingFrom=" + departingFrom + ",departingOnMonth=" + departingOnMonth + ",departingOnMonth=" + departingOnMonth + ",departingOnDate=" + departingOnDate + ",arrivingIn=" + arrivingIn + ",returningMonth=" + returningMonth + ",returningDate=" + returningDate + ",serviceClass=" + serviceClass + ",airlinePreference=" + airlinePreference + "]";
	}
}

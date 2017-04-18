package com.bitm.newtours.dto;

public class BookFlight {

	private String passenger1Fname;
	private String passenger1Lname;
	private String passenger2Fname;
	private String passenger2Lname;
	private String ccCardType;
	private String ccNumber;
	private String ccExpMonth;
	private String ccExpYear;
	private String ccFname;
	private String ccMiddleName;
	private String ccLastName;
	private String billingAddress;
	private String billingCity;
	private String billingState;
	private String billingPostalCode;
	private String billingCountry;
	public String getPassenger1Fname() {
		return passenger1Fname;
	}
	public void setPassenger1Fname(String passenger1Fname) {
		this.passenger1Fname = passenger1Fname;
	}
	public String getPassenger1Lname() {
		return passenger1Lname;
	}
	public void setPassenger1Lname(String passenger1Lname) {
		this.passenger1Lname = passenger1Lname;
	}
	public String getPassenger2Fname() {
		return passenger2Fname;
	}
	public void setPassenger2Fname(String passenger2Fname) {
		this.passenger2Fname = passenger2Fname;
	}
	public String getPassenger2Lname() {
		return passenger2Lname;
	}
	public void setPassenger2Lname(String passenger2Lname) {
		this.passenger2Lname = passenger2Lname;
	}
	public String getCcCardType() {
		return ccCardType;
	}
	public void setCcCardType(String ccCardType) {
		this.ccCardType = ccCardType;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpMonth() {
		return ccExpMonth;
	}
	public void setCcExpMonth(String ccExpMonth) {
		this.ccExpMonth = ccExpMonth;
	}
	public String getCcExpYear() {
		return ccExpYear;
	}
	public void setCcExpYear(String ccExpYear) {
		this.ccExpYear = ccExpYear;
	}
	public String getCcFname() {
		return ccFname;
	}
	public void setCcFname(String ccFname) {
		this.ccFname = ccFname;
	}
	public String getCcMiddleName() {
		return ccMiddleName;
	}
	public void setCcMiddleName(String ccMiddleName) {
		this.ccMiddleName = ccMiddleName;
	}
	public String getCcLastName() {
		return ccLastName;
	}
	public void setCcLastName(String ccLastName) {
		this.ccLastName = ccLastName;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingState() {
		return billingState;
	}
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}
	public String getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	@Override
	public String toString() 
	{
		return "BookFlight [passenger1Fname=" + passenger1Fname + ", passenger1Lname=" + passenger1Lname + ",passenger2Fname=" + passenger2Fname + ",passenger2Lname=" + passenger2Lname + ",ccCardType=" + ccCardType + ",ccNumber=" + ccNumber + ",ccExpMonth=" + ccExpMonth + ",ccExpYear=" + ccExpYear + ",ccFname=" + ccFname + ",ccMiddleName=" + ccMiddleName + ",ccLastName=" + ccLastName + ",billingAddress=" + billingAddress + ",billingCity=" + billingCity + ",billingState=" + billingState + ",billingPostalCode=" + billingPostalCode + ",billingCountry=" + billingCountry + "]";
	}
}

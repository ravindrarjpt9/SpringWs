package com.jackson.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Employee {

	private int id;
    private String name;
    private boolean permanent;
    //private Address address;
    private Map<String, String> address;
    //private long[] phoneNumbers;
    private List<Long> phoneNumbers;
    private String role;
    private List<String> cities;
    private Map<String, String> properties;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
    
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("****** Employee Details *******\n");
		sb.append("ID ="+getId()+"\n");
		sb.append("Name ="+getName()+"\n");
		sb.append("Permanent = "+isPermanent()+"\n");
		sb.append("Role ="+getRole()+"\n");
		sb.append("Phone Numbers="+Arrays.toString(getPhoneNumbers().toArray())+"\n");
		sb.append("Address="+getAddress()+"\n");
		sb.append("Cities="+Arrays.toString(getCities().toArray())+"\n");
		sb.append("Properties="+getProperties()+"\n");
		sb.append("******************************");
		return sb.toString();
	}
}

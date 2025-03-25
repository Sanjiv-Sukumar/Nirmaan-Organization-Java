package com.nirmaan.springAssessment.services;

import java.util.List;

import com.nirmaan.springAssessment.entities.Address;

public interface addressInter {
	public List<Address> getAddresses();
	public Address getAddress(int id);
	public Address addAddress(Address address);
	public String deleteAddress(int id);
	public Address updateAddress(int id , Address address);
}

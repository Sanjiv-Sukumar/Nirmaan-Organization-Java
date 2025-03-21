package com.nirmaan.studentAddress.services;

import com.nirmaan.studentAddress.entities.Address;

import java.util.*;



public interface addressInter {
	
	public Address addAddress(Address adrs);
	public List<Address> getAddresses();
	public Address updataAddress(int id , Address adrs);
	public String deleteAddress(int id);
	public Address getAddressById(int id);
	

}

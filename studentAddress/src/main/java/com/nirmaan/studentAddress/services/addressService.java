package com.nirmaan.studentAddress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.studentAddress.entities.Address;
import com.nirmaan.studentAddress.repositories.addressRepo;

@Service
public class addressService implements addressInter{
	
	@Autowired
	addressRepo repo;
	
	public Address addAddress(Address adrs) {
		
		return repo.save(adrs);
		
	}
	
	public List<Address> getAddresses(){
		
		
		return repo.findAll();
		
	}
	
	public Address updataAddress(int id , Address adrs) {
		adrs.setId(id);
		return repo.save(adrs);
	}
	
	public String deleteAddress(int id) {
		repo.deleteById(id);
		return "Deleted";
	}
	
	public Address getAddressById(int id) {
		
		return repo.findById(id).get();
	}
	

}

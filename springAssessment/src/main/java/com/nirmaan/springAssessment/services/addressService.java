package com.nirmaan.springAssessment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.springAssessment.entities.Address;
import com.nirmaan.springAssessment.repositories.addressRepo;

@Service
public class addressService implements addressInter {

	@Autowired
	addressRepo repo;
	
	@Override
	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Address getAddress(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return repo.save(address);
	}

	@Override
	public String deleteAddress(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

	@Override
	public Address updateAddress(int id, Address address) {
		// TODO Auto-generated method stub
		address.setId(id);
		return repo.save(address);
	}

}

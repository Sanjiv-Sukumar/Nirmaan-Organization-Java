package com.nirmaan.studentAddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.studentAddress.entities.Address;
import com.nirmaan.studentAddress.services.addressService;

@RestController
@RequestMapping("address")
public class addressController {
    
	@Autowired
	addressService addSer;
	
	@PostMapping("addAddress")
	public Address addAddress(@RequestBody Address adrs) {
		return addSer.addAddress(adrs);
	}
	
	@GetMapping("getAddresses")
	public List<Address> getAddresses(){
		return addSer.getAddresses();
	}
	
	@PutMapping("updateAddress/{id}")
	public Address updateAddress(@PathVariable int id ,@RequestBody Address adrs) {
		return addSer.updataAddress(id, adrs);
	}
	
	@DeleteMapping("deleteAddress/{id}")
	public String deleteAddress(@PathVariable int id) {
		
		return addSer.deleteAddress(id);
	}
	
	@GetMapping("getAddress/{id}")
	public Address getAddress(@PathVariable int id) {
		return addSer.getAddressById(id);
	}
	
}

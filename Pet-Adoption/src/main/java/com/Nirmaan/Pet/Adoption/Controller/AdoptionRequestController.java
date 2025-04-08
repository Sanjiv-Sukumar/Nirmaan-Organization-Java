package com.Nirmaan.Pet.Adoption.Controller;

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

import com.Nirmaan.Pet.Adoption.Entity.AdoptionRequest;
import com.Nirmaan.Pet.Adoption.Service.IAdoptionRequestService;

@RestController
@RequestMapping("AdoptionRequest")
public class AdoptionRequestController {
	
	@Autowired IAdoptionRequestService service;
	
//create Adoption Request
	@PostMapping("create")
	public AdoptionRequest createAdoptionRequest(@RequestBody AdoptionRequest request) {
		return  service.createAdoptionRequest(request);
	}
	
//read Adoption Request
	@GetMapping("readAll")
	public List<AdoptionRequest> readAllAdoptionRequest() {
		return  service.getAllAdoptionRequests();
	}
	
	@GetMapping("read/{id}")
	public AdoptionRequest readAdoptionRequestById(@PathVariable int id) {
		return  service.getAdoptionRequestById(id).get();
	}
	
//update Adoption Request
	@PutMapping("update/{id}")
	public String updateAdoptionRequestById(@PathVariable int id,@RequestBody AdoptionRequest request ) {
		service.updateAdoptionRequest(id, request);
		return " Updated Adoption Request Successfully";
	}
//delete Adoption Request
	@DeleteMapping("delete/{id}")
	public String deleteAdoptionRequestById(@PathVariable int id) {
		 service.deleteAdoptionRequest(id);
		 return " Delete the Id "+id+" in Adoption Request successfully";
	}


}

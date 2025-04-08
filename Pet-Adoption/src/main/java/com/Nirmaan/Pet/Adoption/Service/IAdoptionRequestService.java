package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.AdoptionRequest;

@Service

public interface IAdoptionRequestService {
	
	public List<AdoptionRequest> getAllAdoptionRequests();           //read all
	public Optional<AdoptionRequest> getAdoptionRequestById(int id);     //read by id
	public AdoptionRequest createAdoptionRequest(AdoptionRequest adoptionRequest);    //create
	public AdoptionRequest updateAdoptionRequest(int id,AdoptionRequest adoptionRequestDetails);  //update by id
	public void deleteAdoptionRequest(int id);             //delete by id


}

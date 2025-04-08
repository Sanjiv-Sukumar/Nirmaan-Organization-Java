package com.Nirmaan.Pet.Adoption.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmaan.Pet.Adoption.Entity.AdoptionRequest;
import com.Nirmaan.Pet.Adoption.Repository.IAdoptionRequestRepository;

@Service
public class AdoptionRequestService implements IAdoptionRequestService {
	
	@Autowired IAdoptionRequestRepository repository;
//read
    @Override
	public List<AdoptionRequest> getAllAdoptionRequests() {
		return repository.findAll();
	}

	@Override
	public Optional<AdoptionRequest> getAdoptionRequestById(int id) {
		return repository.findById(id);
	}
//create
	@Override
	public AdoptionRequest createAdoptionRequest(AdoptionRequest adoptionRequest) {
		return repository.save(adoptionRequest);
	}
//update
	@Override
	public AdoptionRequest updateAdoptionRequest(int id, AdoptionRequest adoptionRequestDetails) {
		adoptionRequestDetails.setId(id);
		return repository.save(adoptionRequestDetails);
	}
//delete
	@Override
	public void deleteAdoptionRequest(int id) {
		
		repository.deleteById(id);
		
	}

}

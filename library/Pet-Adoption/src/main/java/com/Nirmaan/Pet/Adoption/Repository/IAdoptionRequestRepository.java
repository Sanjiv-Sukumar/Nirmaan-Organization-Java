package com.Nirmaan.Pet.Adoption.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nirmaan.Pet.Adoption.Entity.AdoptionRequest;

@Repository
public interface IAdoptionRequestRepository extends JpaRepository<AdoptionRequest, Integer>{

}

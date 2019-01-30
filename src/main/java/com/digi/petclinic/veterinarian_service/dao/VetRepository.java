package com.digi.petclinic.veterinarian_service.dao;

import com.digi.petclinic.veterinarian_service.entity.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet,Integer>{

}

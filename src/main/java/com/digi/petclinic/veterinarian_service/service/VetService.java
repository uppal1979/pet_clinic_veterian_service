package com.digi.petclinic.veterinarian_service.service;

import com.digi.petclinic.veterinarian_service.dao.VetRepository;
import com.digi.petclinic.veterinarian_service.entity.Vet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetService {

    @Autowired
    VetRepository vetRepository;

    List<Vet> findAllVeterinarian(){

        return vetRepository.findAll();
    }
}

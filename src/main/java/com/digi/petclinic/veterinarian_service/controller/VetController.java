package com.digi.petclinic.veterinarian_service.controller;

import com.digi.petclinic.veterinarian_service.dao.VetRepository;
import com.digi.petclinic.veterinarian_service.dto.VetsList;
import com.digi.petclinic.veterinarian_service.entity.Vet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vet")
public class VetController {

    @Autowired
    VetRepository vetRepository;

    @GetMapping("/veterian")
    public VetsList showVetList(Map<String, Object> model) {

        List<Vet> vet = vetRepository.findAll();
        VetsList vetsList = new VetsList();
        vetsList.setVet(vet);
        return vetsList;
    }

}

package com.digi.petclinic.veterinarian_service.dto;

import com.digi.petclinic.veterinarian_service.entity.Vet;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class VetsList {

    List<Vet> vet;
}

package com.digi.petclinic.veterinarian_service.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class NamedEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

}

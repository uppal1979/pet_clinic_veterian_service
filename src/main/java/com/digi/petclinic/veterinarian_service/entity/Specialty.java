package com.digi.petclinic.veterinarian_service.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {

}

package fr.nsa.jdd.requete.model;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "hello")
@EqualsAndHashCode(callSuper = true)
public class Hello extends AbstractPersistable<Long> {
    private String hello;
}

package edu.maxim.service.entity;

import edu.maxim.service.Type.TypeOfProduct;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    private TypeOfProduct typeOfProduct;

    @ManyToOne
    private Castomer castromer;

}

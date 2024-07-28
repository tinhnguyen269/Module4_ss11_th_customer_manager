package com.example.customer_manager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
public class Controller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fisrtName;
    private String lastName;

    public Controller(String fisrtName, Long id, String lastName) {
        this.fisrtName = fisrtName;
        this.id = id;
        this.lastName = lastName;
    }

    public Controller() {
    }

}

package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "transactions")
public class transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double amount;
    private String description;
    private LocalDate date;

    private String category;
    private String type;

    public transaction() {

    }
}

package com.inicio.jimmy.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ruc;
    private String name;
    private String description;

    public long getId() {
        return id;
    }

    public String getRuc() {
        return ruc;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

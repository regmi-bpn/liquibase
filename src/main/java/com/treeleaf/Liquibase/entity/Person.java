package com.treeleaf.Liquibase.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String height;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public Person() {
    }

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}

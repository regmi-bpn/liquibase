package com.treeleaf.Liquibase.controller;

import com.treeleaf.Liquibase.entity.Person;
import com.treeleaf.Liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {

    private final PersonRepository personRepository;

    @Autowired
    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/person")
    public String createPerson(@RequestParam String name) {
        personRepository.save(new Person(name, "6.7"));
        return personRepository.findByName(name) + "saved successfully!";
    }

    @GetMapping("/person")
    public List<Person> getAllThePeople() {
        return (List<Person>) personRepository.findAll();
    }
}

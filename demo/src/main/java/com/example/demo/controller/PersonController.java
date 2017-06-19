package com.example.demo.controller;

import com.example.demo.beans.Person;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daffyduck on 19/06/2017.
 */
@RestController
@RequestMapping(value = "/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAll() throws Exception{
        return personService.getAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public void create() throws Exception{
        personService.testCreateTransactional();
    }


}

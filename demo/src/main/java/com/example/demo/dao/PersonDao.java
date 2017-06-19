package com.example.demo.dao;

import com.example.demo.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component("personDao")
public interface PersonDao {
    /**
     *
     * @return
     */
   List<Person> getAll();

    /**
     *
     * @param person
     */
   void create(Person person);
}
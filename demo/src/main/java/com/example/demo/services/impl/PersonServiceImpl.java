package com.example.demo.services.impl;

import com.example.demo.beans.Person;
import com.example.demo.dao.PersonDao;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daffyduck on 19/06/2017.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Transactional
    @Override
    public List<Person> getAll() throws Exception {
        return personDao.getAll();
    }

    @Transactional
    @Override
    public void create(Person person) {
        personDao.create(person);
    }

    @Transactional
    @Override
    public void testCreateTransactional() {
        Person person = new Person();
        String correct = "correct";
        person.setNom(correct);
        person.setPrenom(correct);
        person.setEmail(correct);
        person.setPwd(correct);
        Person person2 = new Person();
        String faux = "faux";
        person2.setNom(faux);
        person2.setPrenom(faux);
        personDao.create(person);
    }
}

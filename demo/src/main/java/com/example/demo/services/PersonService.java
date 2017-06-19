package com.example.demo.services;

import com.example.demo.beans.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by daffyduck on 19/06/2017.
 */
public interface PersonService {

    /**
     *
     * @return
     * @throws Exception
     */
    List<Person> getAll() throws Exception;

    /**
     *
     * @param person
     */
    void create(Person person);

    /**
     *
     */
    void testCreateTransactional();
}

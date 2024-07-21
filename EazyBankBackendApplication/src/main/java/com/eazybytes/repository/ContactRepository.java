package com.eazybytes.repository;

import org.springframework.data.repository.CrudRepository;

import com.eazybytes.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, String>{

}

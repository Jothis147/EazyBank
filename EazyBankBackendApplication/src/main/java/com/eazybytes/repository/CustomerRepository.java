package com.eazybytes.repository;

import org.springframework.stereotype.Repository;
import com.eazybytes.entity.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	List<Customer> findByEmail(String email);
}

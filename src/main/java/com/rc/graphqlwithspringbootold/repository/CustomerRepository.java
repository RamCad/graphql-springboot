package com.rc.graphqlwithspringbootold.repository;

import com.rc.graphqlwithspringbootold.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

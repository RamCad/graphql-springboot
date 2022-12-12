package com.rc.graphqlwithspringbootold.service;

import com.rc.graphqlwithspringbootold.model.Customer;
import com.rc.graphqlwithspringbootold.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
  private final CustomerRepository customerRepository;

  public Customer fetchCustomer(Long id) {
    return customerRepository.findById(id).get();
  }
}

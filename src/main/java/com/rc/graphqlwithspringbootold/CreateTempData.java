package com.rc.graphqlwithspringbootold;

import com.rc.graphqlwithspringbootold.model.Customer;
import com.rc.graphqlwithspringbootold.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateTempData implements CommandLineRunner {

  private final CustomerRepository customerRepository;

  @Override
  public void run(String... args) {
    customerRepository.deleteAll();
    customerRepository.save(Customer.builder().firstName("customer1").build());
    customerRepository.save(Customer.builder().firstName("customer2").build());
    customerRepository.save(Customer.builder().firstName("customer3").build());
    customerRepository.save(Customer.builder().firstName("customer4").build());
    customerRepository.save(Customer.builder().firstName("customer5").build());
    customerRepository.save(Customer.builder().firstName("customer6").build());
    customerRepository.save(Customer.builder().firstName("customer7").build());
    customerRepository.save(Customer.builder().firstName("customer8").build());
  }
}

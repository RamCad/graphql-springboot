package com.rc.graphqlwithspringbootold.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.rc.graphqlwithspringbootold.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

  private final CustomerRepository customerRepository;

  public void createCustomer() {

  }
}

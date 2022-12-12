package com.rc.graphqlwithspringbootold.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.rc.graphqlwithspringbootold.model.Customer;
import com.rc.graphqlwithspringbootold.model.SampleRequest;
import com.rc.graphqlwithspringbootold.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

  private final CustomerService customerService;
  /**
   * normal query without params
   */
  public String readQuery() {
    return "GraphQL Query";
  }

  /**
   * query with params
   */
  public String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public String getFullNameWithModel(SampleRequest request) {
    return request.getFirstName()+ " " + request.getLastName();
  }

  public Customer getCustomer(long id) {
    return customerService.fetchCustomer(id);
  }
}

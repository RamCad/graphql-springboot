package com.rc.graphqlwithspringbootold.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String line1;
  private String line2;
  private String city;
  private String state;
  private String country;

  @OneToOne
  @JoinColumn(name = "customer_id", referencedColumnName = "id")
  private Customer customer;
}

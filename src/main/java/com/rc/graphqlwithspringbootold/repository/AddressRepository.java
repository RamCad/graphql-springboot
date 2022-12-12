package com.rc.graphqlwithspringbootold.repository;

import com.rc.graphqlwithspringbootold.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}

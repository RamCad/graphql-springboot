package com.rc.graphqlwithspringbootold.repository;

import com.rc.graphqlwithspringbootold.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}

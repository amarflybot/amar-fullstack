package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by amarendrakumar on 25/07/17.
 */
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person,Long> {
}

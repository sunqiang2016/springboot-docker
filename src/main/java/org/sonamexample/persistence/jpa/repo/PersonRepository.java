package org.sonamexample.persistence.jpa.repo;

import org.sonamexample.persistence.jpa.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by c14423 on 3/13/17.
 */
public interface PersonRepository extends CrudRepository<Person, Long>{
}
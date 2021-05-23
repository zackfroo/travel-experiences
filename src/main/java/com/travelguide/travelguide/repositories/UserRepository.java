package com.travelguide.travelguide.repositories;
import org.springframework.data.repository.CrudRepository;

import com.travelguide.travelguide.entities.User;


public interface UserRepository extends CrudRepository<User, Long>{

}

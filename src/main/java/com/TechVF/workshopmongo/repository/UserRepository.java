package com.TechVF.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.TechVF.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

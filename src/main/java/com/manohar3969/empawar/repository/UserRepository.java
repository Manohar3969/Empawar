package com.manohar3969.empawar.repository;

import com.manohar3969.empawar.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUserEmailID(String userEmailID);
}

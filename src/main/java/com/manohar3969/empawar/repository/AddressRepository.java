package com.manohar3969.empawar.repository;

import com.manohar3969.empawar.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
    Optional<Address> findByUserId(String userId);
}

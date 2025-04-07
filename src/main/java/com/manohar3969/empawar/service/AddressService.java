package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Address;
import com.manohar3969.empawar.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address createProduct(Address address) {
        return addressRepository.save(address);
    }
}

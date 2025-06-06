package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Address;
import com.manohar3969.empawar.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public Address createProduct(@RequestBody Address address) {
        return addressService.createProduct(address);
    }

    @GetMapping("users/{userId}")
    public Optional<Address> getAddressForUser(@PathVariable String userId) {
        return addressService.getAddressByUserId(userId);
    }

}

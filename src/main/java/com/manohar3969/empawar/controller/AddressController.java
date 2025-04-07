package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Address;
import com.manohar3969.empawar.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}

package com.hospitalManagement.Patient.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalManagement.Patient.Jpa.AddrressJpa;
import com.hospitalManagement.Patient.dto.Address;

@Service



public class AddressDao {
	@Autowired
	private AddrressJpa addrressJpa;

	public Address saveAddrees(Address address) {

		return addrressJpa.save(address);

	}

}

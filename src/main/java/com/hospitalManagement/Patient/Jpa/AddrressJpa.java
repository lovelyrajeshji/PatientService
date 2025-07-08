package com.hospitalManagement.Patient.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.Patient.dto.Address;

public interface AddrressJpa extends JpaRepository<Address, Long> {

}

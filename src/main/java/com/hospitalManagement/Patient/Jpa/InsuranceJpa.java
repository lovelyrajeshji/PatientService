package com.hospitalManagement.Patient.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.Patient.dto.Insurance;

public interface InsuranceJpa extends JpaRepository<Insurance, Long> {

}

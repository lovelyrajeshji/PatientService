package com.hospitalManagement.Patient.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.Patient.dto.Patient;

public interface PatientJpa extends JpaRepository<Patient, Long> {

}

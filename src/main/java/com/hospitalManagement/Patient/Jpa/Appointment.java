package com.hospitalManagement.Patient.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.Patient.dto.Appoinment;

public interface Appointment extends JpaRepository<Appoinment, Long> {

}

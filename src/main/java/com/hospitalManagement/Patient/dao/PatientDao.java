package com.hospitalManagement.Patient.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalManagement.Patient.ExceptionHandling.BusinessException;
import com.hospitalManagement.Patient.Jpa.PatientJpa;
import com.hospitalManagement.Patient.dto.Patient;

@Service
public class PatientDao {

	@Autowired
	private PatientJpa patientJpa;

	public Patient createPatient(Patient patient) {
		return patientJpa.save(patient);
	}

	public List<Patient> getAllPatientDetails() {
		return patientJpa.findAll();
	}

	public Patient getById(long id) {

		Optional<Patient> p = patientJpa.findById(id);
		;
		if (p.isEmpty()) {
			throw new BusinessException("400", "No value presents");
		} else {
			return p.get();
		}
	}
}

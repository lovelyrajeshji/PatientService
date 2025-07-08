package com.hospitalManagement.Patient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.Patient.dao.PatientDao;
import com.hospitalManagement.Patient.dto.Patient;

@RestController
public class PatientController {

	@Autowired
	private PatientDao dao;

	@PostMapping(value = "/patient/register")
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
		Patient patient2 = dao.createPatient(patient);
		return new ResponseEntity<Patient>(patient2, HttpStatus.CREATED);

	}

	@GetMapping(value = "/printAllPatinetDetails")
	public ResponseEntity<List<Patient>> getAllPatientDetails() {
		return ResponseEntity.ok().body(dao.getAllPatientDetails());
	}

	@GetMapping(value = "/getByPatientId/{id}")
	public ResponseEntity<Patient> getByPatientId(@PathVariable long id) {

		return ResponseEntity.ok().body(dao.getById(id));
	}
}

package com.hospitalManagement.Patient.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "medicalRecord")
@Data
@AllArgsConstructor
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate recordDate;
	private String diagnosis;
	private String treatment;
	private String doctorNotes;
}

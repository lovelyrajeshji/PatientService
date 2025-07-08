package com.hospitalManagement.Patient.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospitalManagement.Patient.Enum.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phnoe;
	private LocalDate dateOfBirth;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String bllodGroup;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Address address;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Insurance insurance;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MedicalRecord> medicalRecords;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Appoinment> appoinments;

}

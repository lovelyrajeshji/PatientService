package com.hospitalManagement.Patient.dto;

import com.hospitalManagement.Patient.Enum.AppoinmentStatus;

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
@Table(name = "appoinment")
@Data
@AllArgsConstructor
public class Appoinment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;
	private Long DactorId;
	private AppoinmentStatus status;
	private String reason;
	private String notes;

}

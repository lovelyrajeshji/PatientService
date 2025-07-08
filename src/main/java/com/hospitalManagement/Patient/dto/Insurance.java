package com.hospitalManagement.Patient.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "insurance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String providerName;
	private String policyNumber;
	private LocalDate expiryDate;

}

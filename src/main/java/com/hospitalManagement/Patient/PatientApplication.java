package com.hospitalManagement.Patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}
	@Bean
	public String hotfixBean(){
<<<<<<< HEAD
		return "Hotfix from feature";
=======
		return "Hotfix from feature to main";
>>>>>>> feature
	}

}

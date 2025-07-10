package com.hospitalManagement.Patient.Controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.Patient.dao.AddressDao;
import com.hospitalManagement.Patient.dto.Address;

@RestController
public class AddressController {
	@Autowired
	private AddressDao addressDao;

	@PostMapping(value = "/save/address")
	public ResponseEntity<Address> saveEntity(@RequestBody Address address) {
		Address ad = addressDao.saveAddrees(address);
		return new ResponseEntity(ad, HttpStatus.CREATED);

	}

}

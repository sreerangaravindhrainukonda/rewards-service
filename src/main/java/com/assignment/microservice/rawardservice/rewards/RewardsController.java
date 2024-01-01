package com.assignment.microservice.rawardservice.rewards;

import java.util.List;

import com.assignment.microservice.rawardservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class RewardsController {

	@Autowired
	private RewardsService rewardsService;
	

	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		// The good practice is to convert the entity into dto before sending the response but for quick solution returning it as entity as DTOs
		if (customer == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
}





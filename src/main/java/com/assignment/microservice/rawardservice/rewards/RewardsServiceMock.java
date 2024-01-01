package com.assignment.microservice.rawardservice.rewards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.assignment.microservice.rawardservice.model.Customer;
import com.assignment.microservice.rawardservice.model.CustomerTransaction;
import org.springframework.stereotype.Service;

@Service
public class RewardsServiceMock {

	private static List<CustomerTransaction> transactions = new ArrayList<CustomerTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new CustomerTransaction(index++, new Customer(1, "Mohsen"), 170.0, "Purchase 1", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(2, "Max"), 55.0, "Purchase 2", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(3, "Lauren"), 200.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<CustomerTransaction> getAll() {
		return transactions;
	}
	
}




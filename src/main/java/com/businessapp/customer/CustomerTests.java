package com.businessapp.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.businessapp.pojos.Customer;
import com.businessapp.pojos.Customer.CustomerStatus;
import com.businessapp.pojos.LogEntry;

class CustomerTests {
	
	@Test
	public void testgetId() {
		String id = "01";
		String name = "Meyer";
		Customer cus = new Customer(id, name);
		assertEquals(cus.getId(), "01");
		
		id = "";
		name = "Meyer";
		Customer cus2 = new Customer(id, name);
		assertEquals(cus2.getId(), "");
	}
	@Test
	public void testgetName() {
		String id = "01";
		String name = "Meyer";
		Customer cus = new Customer(id, name);
		assertEquals(cus.getName(), "Meyer");
		
		id = "01";
		name = "";
		Customer cus2 = new Customer(id, name);
		assertEquals(cus2.getName(), "");
		
		id = "01";
		name = null;
		Customer cus3 = new Customer(id, name);
		assertEquals(cus3.getName(), null);
	}
	@Test
	public void testgetContacts() {
		List<String> con = new ArrayList<String>();
		con.add("");
		Customer cus = new Customer("", "");
		cus.addContact("");
		assertEquals(cus.getContacts(), con);
		
		List<String> con2 = new ArrayList<String>();
		con2.add(null);
		Customer cus2 = new Customer("","");
		cus2.addContact(null);
		assertEquals(cus2.getContacts(), con2);
	}

	@Test
	public void testgetStatus() {
		Customer cus = new Customer("", "");
		cus.setStatus(null);
		assertEquals(cus.getStatus(), null);
		cus.setStatus(CustomerStatus.ACTIVE);
		assertEquals(cus.getStatus(), CustomerStatus.ACTIVE);
	}

}

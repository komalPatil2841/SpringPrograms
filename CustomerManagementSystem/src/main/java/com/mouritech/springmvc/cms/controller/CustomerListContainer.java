package com.mouritech.springmvc.cms.controller;

import java.util.List;

import com.mouritech.springmvc.cms.model.Customer;



public class CustomerListContainer {
	 private List<Customer> customers;

		public List<Customer> getCustomers() {
			return customers;
		}

		public void setCustomers(List<Customer> customers) {
			this.customers = customers;
		}

}

package com.mouritech.springmvc.cms.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.springmvc.cms.model.Customer;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	public List<Customer> customerList() {
		List<Customer> customer = new ArrayList<Customer>();
		customer.add(new Customer(123,"Komal Patil","7894561236","k1265@gmail"));
		customer.add(new Customer(123,"Raj Patil","7894561236","R1265@gmail"));
		customer.add(new Customer(123,"Sonal Raut","7895661236","SS1265@gmail"));
		return customer;
		
	}

	@RequestMapping(value = "/listcustomer", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Customer> customer = customerList();
	    CustomerListContainer newcustomerList = new CustomerListContainer();
	    newcustomerList.setCustomers(customer);
	    model.addAttribute("Customers", newcustomerList);
	    return "customerlist";
	  }
}

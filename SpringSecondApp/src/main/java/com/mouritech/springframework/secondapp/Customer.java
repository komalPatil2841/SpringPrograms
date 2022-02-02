package com.mouritech.springframework.secondapp;

import org.springframework.stereotype.Service;

@Service("customerService")
public class Customer {
	private int custid;
	private String custname;
	private  String custmob;
	private  String custemail;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustmob() {
		return custmob;
	}
	public void setCustmob(String custmob) {
		this.custmob = custmob;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

}

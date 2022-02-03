package com.mouritech.springmvc.cms.model;

public class Customer {

	private int custId;
	private String custName;
	private String custMob;
	private String custEmail;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String custMob, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.custEmail = custEmail;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custMob=" + custMob + ", custEmail="
				+ custEmail + "]";
	}

}

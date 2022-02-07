package com.mouritech.sellermanagementsystemwithrestcontroller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerid")
	private Long sellerId;
	@Column(name = "selleremail")
	private String selleremail;
	@Column(name = "sellername")
	private String sellername;
	
	@Column(name = "sellermobno")
	private String sellermobno;
	
	@Column(name = "sellercity")
	
	private String sellercity;
	

	
	@Column(name = "sellercategory")
	
	private String sellercategory;
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	public String getSelleremail() {
		return selleremail;
	}
	public void setSelleremail(String selleremail) {
		this.selleremail = selleremail;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSellermobno() {
		return sellermobno;
	}
	public void setSellermobno(String sellermobno) {
		this.sellermobno = sellermobno;
	}
	public String getSellercity() {
		return sellercity;
	}
	public void setSellercity(String sellercity) {
		this.sellercity = sellercity;
	}
	public String getSellercategory() {
		return sellercategory;
	}
	public void setSellercategory(String sellercategory) {
		this.sellercategory = sellercategory;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", selleremail=" + selleremail + ", sellername=" + sellername
				+ ", sellermobno=" + sellermobno + ", sellercity=" + sellercity + ", sellercategory=" + sellercategory
				+ "]";
	}
	public Seller(String selleremail, String sellername, String sellermobno, String sellercity, String sellercategory) {
		super();
		this.selleremail = selleremail;
		this.sellername = sellername;
		this.sellermobno = sellermobno;
		this.sellercity = sellercity;
		this.sellercategory = sellercategory;
	}

	
	
}

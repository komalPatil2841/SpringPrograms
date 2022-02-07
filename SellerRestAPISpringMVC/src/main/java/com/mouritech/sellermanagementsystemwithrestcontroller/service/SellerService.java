package com.mouritech.sellermanagementsystemwithrestcontroller.service;

import java.util.List;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;





public interface SellerService {

	List<Seller> getAllSellers();

	void saveSeller(Seller theNewSeller);

	Seller getSeller(Long selid) throws SellerNotFoundException;

	

	void updateSeller(Long selid, Seller theNewSeller);
	

	void updateSellerName(Long selid, String selname);

	void updateSellerEmail(Long selid, String selemail);
	void updateSellerMob(Long selid, String selmob);
	void updateSellerCity(Long selid, String selcity);
	void updateSellerCategory(Long selid, String selcat);

	void deleteSeller(Long selid);

	

}

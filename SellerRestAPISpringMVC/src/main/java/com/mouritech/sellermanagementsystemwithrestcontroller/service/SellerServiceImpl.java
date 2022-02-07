package com.mouritech.sellermanagementsystemwithrestcontroller.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.repository.SellerRepository;


@Service
public class SellerServiceImpl implements SellerService{
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional
	public List<Seller> getAllSellers() {
		
		return sellerRepository.findAll();
	}

	@Transactional
	public void saveSeller(Seller theNewSeller) {
		
		sellerRepository.save(theNewSeller);
	}

	@Transactional
	public Seller getSeller(Long selid) throws SellerNotFoundException{
		return sellerRepository.findById(selid)
				.orElseThrow(() -> new SellerNotFoundException(selid));
	}
	
	@Transactional
	public void deleteSeller(Long selid) {
		sellerRepository.deleteById(selid);
		
	}

	@Override
	@Transactional
	public void updateSeller(Long selid, Seller theNewSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSellername(theNewSeller.getSellername());
			existingSeller.setSelleremail(theNewSeller.getSelleremail());
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void updateSellerEmail(Long selid, String selemail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSelleremail(selemail);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public void updateSellerMob(Long selid, String selmob) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSellername(selmob);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public void updateSellerName(Long selid, String selname) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSellername(selname);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public void updateSellerCity(Long selid, String selcity) {
		// TODO Auto-generated method stub
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSellername(selcity);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public void updateSellerCategory(Long selid, String selcat) {
		// TODO Auto-generated method stub
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
			existingSeller.setSellername(selcat);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}

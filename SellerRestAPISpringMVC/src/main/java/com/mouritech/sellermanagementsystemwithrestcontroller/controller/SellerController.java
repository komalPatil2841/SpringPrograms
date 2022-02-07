package com.mouritech.sellermanagementsystemwithrestcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.service.SellerService;
@RestController
@RequestMapping("/api/v1")
public class SellerController {
	@Autowired
	private SellerService selService;
	
	@PostMapping("/seller") 
	public ResponseEntity<?> saveSeller(@RequestBody Seller theNewSeller) {
		selService.saveSeller(theNewSeller);
		return ResponseEntity.ok().body("New seller added successfully");
	}
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSellers() {
		List<Seller> sellerList = selService.getAllSellers();
		return ResponseEntity.ok().body(sellerList);
	}
	
	@PutMapping("/seller/{sid}")
	public ResponseEntity<?> updateSeller(@PathVariable("sid") Long selid,@RequestBody Seller theNewSeller ) throws SellerNotFoundException {
		
		 selService.updateSeller(selid,theNewSeller);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }

	@PutMapping("/sellername/{sid}/{selname}")
	public ResponseEntity<?> updateSellerDate(@PathVariable("sid") Long selid,
			@PathVariable("selname") String selname) throws SellerNotFoundException {
		
		 selService.updateSellerName(selid,selname);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/sellermob/{sid}/{smob}")
	public ResponseEntity<?> updateSellerMob(@PathVariable("sid") Long selid,
			@PathVariable("smob") String selmob) throws SellerNotFoundException {
		
		 selService.updateSellerMob(selid,selmob);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	@PutMapping("/sellercat/{sid}/{scat}")
	public ResponseEntity<?> updateSellerCategory(@PathVariable("sid") Long selid,
			@PathVariable("scat") String selcat) throws SellerNotFoundException {
		
		 selService.updateSellerEmail(selid,selcat);
		return ResponseEntity.ok().body("Seller updated successfully");
		}
	
		
		@PutMapping("/sellercity/{sid}/{scity}")
		public ResponseEntity<?> updateSellerCity(@PathVariable("sid") Long selid,
				@PathVariable("scity") String selcity) throws SellerNotFoundException {
			
			 selService.updateSellerEmail(selid,selcity);
			return ResponseEntity.ok().body("Seller updated successfully");
			
		 
	 }
	@PutMapping("/sellervalue/{sid}/{semail}")
	public ResponseEntity<?> updateSellerValue(@PathVariable("sid") Long selid,
			@PathVariable("semail") String selemail) throws SellerNotFoundException {
		
		 selService.updateSellerEmail(selid,selemail);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	
	@GetMapping("/seller/{sid}")
	public ResponseEntity<Seller> getSeller(@PathVariable("sid") Long selid) throws SellerNotFoundException {
		Seller seller = selService.getSeller(selid);
		return ResponseEntity.ok().body(seller);
	}

	
	@DeleteMapping("/seller/{sid}")
	public ResponseEntity<?> deleteSeller(@PathVariable("sid") Long selid) throws SellerNotFoundException {
		selService.deleteSeller(selid);
		return ResponseEntity.ok().body("Seller deleted successfully");
	}

}

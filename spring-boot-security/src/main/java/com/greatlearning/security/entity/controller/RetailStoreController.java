package com.greatlearning.security.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.security.entity.InventryDetails;
import com.greatlearning.security.service.RetailStoreService;

@RestController
@RequestMapping("/organicVeggies")
public class RetailStoreController {

	@Autowired
	private RetailStoreService retailStoreService;

	@GetMapping("/checkInventory")
	public boolean checkInventoryExist(int id) {
		return retailStoreService.checkInventoryExist(id);
	}

	@GetMapping("/viewInventory")
	public List<InventryDetails> viewInventry() {
		return retailStoreService.viewInventry();
	}

	@PostMapping("/makeAnnouncement")
	public String makeAnnouncement(String discount) {
		return retailStoreService.makeAnnouncement(discount);
	}

	@PostMapping("/doCheckout")
	public String doCheckout() {
		return retailStoreService.doCheckout();
	}

}

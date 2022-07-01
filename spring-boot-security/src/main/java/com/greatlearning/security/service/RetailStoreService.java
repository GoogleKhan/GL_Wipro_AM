package com.greatlearning.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.security.entity.InventryDetails;
import com.greatlearning.security.entity.YearlyFinancialReport;
import com.greatlearning.security.repository.EmployeeRepository;
import com.greatlearning.security.repository.InventoryDetailsRepository;
import com.greatlearning.security.repository.YearlyFinancialReportRepository;

@Service
public class RetailStoreService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private InventoryDetailsRepository inventoryDetailsRepository;
	
	@Autowired
	private YearlyFinancialReportRepository yearlyFinancialReportRepository;

	public boolean checkInventoryExist(int id) {
		return inventoryDetailsRepository.existsById(id);
	}

	public List<InventryDetails> viewInventry() {
		return inventoryDetailsRepository.findAll();
	}
	
	public String makeAnnouncement(String discount) {
		return discount + " % off";
	}
	public List<YearlyFinancialReport> viewFinancials() {
		return yearlyFinancialReportRepository.findAll();
	}
	
	public String doCheckout() {
		return "fake checkout";
	}
	
}

package com.greatlearning.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//JPA
@Entity
public class YearlyFinancialReport {

	@Id
	private Integer id;

	@Column(name = "YEAR")
	private String year;
	
	@Column(name = "NET_REVENUE")
	private int netRevenue;

	@Column(name = "METERIAL_COST")
	private int meterialCost;
	
	@Column(name = "NET_PROFIT")
	private int netProfit;


}

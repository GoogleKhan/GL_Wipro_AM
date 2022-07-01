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
public class InventryDetails {

	@Id
	private Integer id;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@Column(name = "NUMBER_OF_ITEMS_AVAIALBLE")
	private int numberOfItemsAvailable;
	
	@Column(name = "PRICE")
	private int price;


}

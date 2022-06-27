package com.wipro.MongoDB.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document
public class Product {
	
	private long id;
	private String name;
	private int quantity;
	private String category;

}

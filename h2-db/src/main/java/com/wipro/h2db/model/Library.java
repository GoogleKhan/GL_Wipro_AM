package com.wipro.h2db.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Library {

	@Id
	private long id;

	private String name;
	private String commaSeparatedBookNames;

}

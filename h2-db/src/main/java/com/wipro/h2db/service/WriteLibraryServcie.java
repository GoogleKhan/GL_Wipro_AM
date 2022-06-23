package com.wipro.h2db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.h2db.model.Library;
import com.wipro.h2db.repository.LibraryRepository;

@Service
public class WriteLibraryServcie {

	@Autowired
	private LibraryRepository libraryRepository;

	public void add(Library library) {
		libraryRepository.saveAndFlush(library);
	}

}

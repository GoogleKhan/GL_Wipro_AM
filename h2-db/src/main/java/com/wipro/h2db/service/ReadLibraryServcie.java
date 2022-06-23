package com.wipro.h2db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.wipro.h2db.model.Library;
import com.wipro.h2db.repository.LibraryRepository;

@Service
public class ReadLibraryServcie {

	@Autowired
	private LibraryRepository libraryRepository;

	public List<Library> getAllLibraries() {
		return libraryRepository.findAll();
	}

	public List<Library> getAllLibrariesWithNoBooks() {

		Library library = new Library();
		library.setCommaSeparatedBookNames("");

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeparatedBookNames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		return libraryRepository.findAll(example);
	}

	public Page<Library> getLibraryPaged() {

		Pageable pageable = PageRequest.of(0, 4);

		return libraryRepository.findAll(pageable);
	}

	public Page<Library> getLibraryPaged(int pageNum, int numOfRecordsOnPage) {

		Pageable pageable = PageRequest.of(pageNum, numOfRecordsOnPage);

		return libraryRepository.findAll(pageable);
	}

	public List<Library> getLibrariesWithLatestAddedOrder() {

		Sort sort = Sort.by(Direction.ASC, "id");

		return libraryRepository.findAll(sort);
	}

	public List<Library> getLibrariesWithLatestAddedOrder(Direction direction) {

		Sort sort = Sort.by(direction, "id");

		return libraryRepository.findAll(sort);
	}

	public List<Library> getLibrariesSortedByName(Direction direction) {

		Sort sort = Sort.by(direction, "name");

		return libraryRepository.findAll(sort);
	}

	public Page<Library> getLibrariesPagedAndSortedByNameAndWithTheseBooks(String commaSeparatedBookNames) {

		Library library = new Library();
		library.setCommaSeparatedBookNames(commaSeparatedBookNames);

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeparatedBookNames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		Pageable pageable = PageRequest.of(0, 2, Sort.by("name"));

		return libraryRepository.findAll(example, pageable);
	}

	public Page<Library> getLibrariesCustomPagedAndSortedWithDefaultOrderByNameAndWithTheseBooks(
			String commaSeparatedBookNames, int pageNum, int numOfRecordsOnPage) {

		Library library = new Library();
		library.setCommaSeparatedBookNames(commaSeparatedBookNames);

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeparatedBookNames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		Pageable pageable = PageRequest.of(pageNum, numOfRecordsOnPage, Sort.by("name"));

		return libraryRepository.findAll(example, pageable);
	}

	public Page<Library> getLibrariesPagedAndSortedByName() {

		Pageable pageable = PageRequest.of(0, 2, Sort.by("name"));

		return libraryRepository.findAll(pageable);
	}

	public List<Library> getSortedByNameAndWithTheseBook(String commaSeparatedBookNames) {

		Library library = new Library();
		library.setCommaSeparatedBookNames(commaSeparatedBookNames);

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeparatedBookNames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		Sort sort = Sort.by("name");

		return libraryRepository.findAll(example, sort);
	}

	public List<Library> getLibrariesByIds(List<Long> ids) {
		return libraryRepository.findAllById(ids);
	}

	public List<Library> getAllLibrariesWithTheseBooks(String commaSeparatedBookNames) {

		Library library = new Library();
		library.setCommaSeparatedBookNames(commaSeparatedBookNames);

		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("commaSeparatedBookNames", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "name");

		Example<Library> example = Example.of(library, exampleMatcher);

		return libraryRepository.findAll(example);
	}
}

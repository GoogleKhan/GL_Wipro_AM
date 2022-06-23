package com.wipro.h2db;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;

import com.wipro.h2db.model.Library;
import com.wipro.h2db.service.ReadLibraryServcie;
import com.wipro.h2db.service.WriteLibraryServcie;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class H2DbApplication implements CommandLineRunner {

	@Autowired
	private ReadLibraryServcie libraryServcie;

	@Autowired
	private WriteLibraryServcie writeLibraryServcie;

	public static void main(String[] args) {
		SpringApplication.run(H2DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		readLibraryData();

		Library library = new Library();
		library.setId(201L);
		library.setCommaSeparatedBookNames("Two States, EidGhah, Thanda Ghost");
		library.setName("Shad-Lib");

		writeLibraryServcie.add(library);
		log.info("Adding is doen");

	}

	public void readLibraryData() {

		List<Library> allLibrary = libraryServcie.getAllLibraries();
		log.info("Fetch all Libraries -> {}", allLibrary);

		List<Library> allLibraryWithNoBooks = libraryServcie.getAllLibrariesWithNoBooks();
		log.info("Fetch all Libraries with no books -> {}", allLibraryWithNoBooks);

		Page<Library> libraryPage = libraryServcie.getLibraryPaged();
		log.info("Fetch all Libraries in Page Format -> {}", libraryPage.get().collect(Collectors.toList()));

		Page<Library> libraryPageCustom = libraryServcie.getLibraryPaged(0, 3);
		log.info("Fetch all Libraries in Page Format(0,3) -> {}", libraryPageCustom.get().collect(Collectors.toList()));

		Page<Library> libraryPageCustom2 = libraryServcie.getLibraryPaged(1, 3);
		log.info("Fetch all Libraries in Page Format(1,3) -> {}",
				libraryPageCustom2.get().collect(Collectors.toList()));

		List<Library> librariesWithLatestAddedOrder = libraryServcie.getLibrariesWithLatestAddedOrder(Direction.DESC);
		log.info("Fetch all Libraries with latest added order -> {}", librariesWithLatestAddedOrder);

		List<Library> librariesSortedByName = libraryServcie.getLibrariesSortedByName(Direction.ASC);
		log.info("Fetch all Libraries with sorted name order -> {}", librariesSortedByName);

		Page<Library> librariesPagedAndSortedByNameAndWithTheseBooks = libraryServcie
				.getLibrariesPagedAndSortedByNameAndWithTheseBooks("Book-A, Book-B, Book-C");
		log.info("Fetch all Libraries Paged And SortedByName And WithTheseBooks -> {}",
				librariesPagedAndSortedByNameAndWithTheseBooks.get().collect(Collectors.toList()));

		Page<Library> librariesPagedAndSortedByNameAndWithTheseBooks2 = libraryServcie
				.getLibrariesCustomPagedAndSortedWithDefaultOrderByNameAndWithTheseBooks("Book-A, Book-B, Book-C", 0,
						3);
		log.info("Fetch all Libraries Custom Paged And SortedByName And WithTheseBooks -> {}",
				librariesPagedAndSortedByNameAndWithTheseBooks2.get().collect(Collectors.toList()));

		log.info("Fetch all Libraries Paged And SortedByName -> {}",
				libraryServcie.getLibrariesPagedAndSortedByName().get().collect(Collectors.toList()));

		log.info("Fetch all Libraries SortedByName with these books -> {}",
				libraryServcie.getSortedByNameAndWithTheseBook("Book-A, Book-B, Book-C"));

		List<Long> ids = List.of(102L, 103L);
		log.info("Fetch all Libraries by ids -> {}", libraryServcie.getLibrariesByIds(ids));

		log.info("Fetch all Libraries with these books -> {}",
				libraryServcie.getAllLibrariesWithTheseBooks("Book-A, Book-B, Book-C"));

	}

}

package com.wipro.h2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.h2db.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}

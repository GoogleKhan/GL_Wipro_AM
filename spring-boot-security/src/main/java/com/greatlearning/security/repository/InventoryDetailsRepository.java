package com.greatlearning.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.security.entity.InventryDetails;
@Repository
public interface InventoryDetailsRepository extends JpaRepository<InventryDetails, Integer>{

}

package com.greatlearning.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.security.entity.YearlyFinancialReport;

@Repository
public interface YearlyFinancialReportRepository extends JpaRepository<YearlyFinancialReport, Integer>{

}

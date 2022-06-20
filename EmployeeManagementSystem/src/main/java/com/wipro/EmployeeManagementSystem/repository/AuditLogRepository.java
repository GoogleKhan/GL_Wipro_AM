package com.wipro.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.EmployeeManagementSystem.model.AuditLog;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long>{

}

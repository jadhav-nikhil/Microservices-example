package com.dailycodebuffer.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dailycodebuffer.department.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}

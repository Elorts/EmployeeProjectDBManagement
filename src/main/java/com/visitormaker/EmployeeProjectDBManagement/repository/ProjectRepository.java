package com.visitormaker.EmployeeProjectDBManagement.repository;

import com.visitormaker.EmployeeProjectDBManagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}

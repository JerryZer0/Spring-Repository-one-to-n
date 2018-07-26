package com.oocl.SpringBoot.one.to.n.repositories;

import com.oocl.SpringBoot.one.to.n.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

package com.oocl.SpringBoot.one.to.n.controllers.dto;

import com.oocl.SpringBoot.one.to.n.entities.Company;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyDTO {
    private final Long id;
    private final String name;
    private final ZonedDateTime createdDate;
    private final List<EmployeeDTO> employeeList;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public List<EmployeeDTO> getEmployeeList() {
        return employeeList;
    }

    public CompanyDTO(Company company){
        this.id = company.getId();
        this.name = company.getName();
        this.createdDate = company.getCreatedDate();
        this.employeeList = company.getEmployeeList().stream().map(employee -> new EmployeeDTO(employee)).collect(Collectors.toList());
    }
}

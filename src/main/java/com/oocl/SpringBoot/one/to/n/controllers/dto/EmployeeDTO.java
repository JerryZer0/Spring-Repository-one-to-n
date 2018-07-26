package com.oocl.SpringBoot.one.to.n.controllers.dto;

import com.oocl.SpringBoot.one.to.n.entities.Employee;

import java.time.ZonedDateTime;

public class EmployeeDTO {

    private final Long id;
    private final String name;
    private final ZonedDateTime createdDate;
    private final Long companyId;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.createdDate = employee.getCreatedDate();
        this.companyId = employee.getCompany().getId();
    }
}

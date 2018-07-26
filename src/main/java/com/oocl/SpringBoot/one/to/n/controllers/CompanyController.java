package com.oocl.SpringBoot.one.to.n.controllers;

import com.oocl.SpringBoot.one.to.n.controllers.dto.CompanyDTO;
import com.oocl.SpringBoot.one.to.n.entities.Company;
import com.oocl.SpringBoot.one.to.n.repositories.CompanyRepository;
import com.oocl.SpringBoot.one.to.n.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Transactional
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Company save(@RequestBody Company company) {
//        return companyRepository.save(company);
        company.getEmployeeList().stream().forEach(employee ->
                employee.setCompany(company));
        return companyRepository.save(company);
    }

    @Transactional
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyDTO findById(@PathVariable("id") Long id) {
        Company company = companyRepository.findById(id).get();
        return new CompanyDTO(company);
    }

    @Transactional
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Transactional
    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity update(@RequestBody Company company) {
        company.getEmployeeList().stream().filter(employee ->
                employee.getCompany() == null).forEach(employee ->
                employee.setCompany(company));
        companyRepository.save(company);
        //System.err.println(company.getEmployeeList().get(0).getName());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Transactional
    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Company delete(@PathVariable long id) {
        Company company = companyRepository.findById(id).get();
        companyRepository.delete(company);
        return company;
    }

}

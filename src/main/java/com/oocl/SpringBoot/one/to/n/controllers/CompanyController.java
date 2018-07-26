package com.oocl.SpringBoot.one.to.n.controllers;

import com.oocl.SpringBoot.one.to.n.entities.Company;
import com.oocl.SpringBoot.one.to.n.repositories.CompanyRepository;
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

//    @Autowired
//    public CompanyController(CompanyRepository companyRepository) {
//        this.companyRepository = companyRepository;
//    }

    @Transactional
//    @Transient
    @PostMapping(path="",produces = MediaType.APPLICATION_JSON_VALUE)
    public Company save(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @Transactional
    @PostMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Company findById(@PathVariable long id){
        return companyRepository.findById(id).get();
    }

    @Transactional
    //@Transient
    @GetMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Company> findAll(){
        return  companyRepository.findAll();
    }

    @Transactional
    //@Transient
    @PutMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Company update(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @Transactional
    @DeleteMapping(path="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable long id){
        companyRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

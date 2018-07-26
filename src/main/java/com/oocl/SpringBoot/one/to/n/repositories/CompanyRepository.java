package com.oocl.SpringBoot.one.to.n.repositories;

import com.oocl.SpringBoot.one.to.n.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    List<Company> findByName(String name);
}

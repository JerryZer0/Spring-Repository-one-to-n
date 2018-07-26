package com.oocl.SpringBoot.one.to.n.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "tw_company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @CreatedDate
    private ZonedDateTime createdDate = ZonedDateTime.now();

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

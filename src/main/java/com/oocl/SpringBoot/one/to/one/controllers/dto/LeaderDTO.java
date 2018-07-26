package com.oocl.SpringBoot.one.to.one.controllers.dto;

import com.oocl.SpringBoot.one.to.one.entities.Leader;

public class LeaderDTO {
    private final int id;
    private final String name;
    private final String sex;

    public LeaderDTO(Leader leader) {
        this.id = leader.getId();
        this.name = leader.getName();
        this.sex = leader.getSex();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}

package com.oocl.SpringBoot.one.to.one.controllers.dto;

import com.oocl.SpringBoot.one.to.one.entities.Klass;
import com.oocl.SpringBoot.one.to.one.entities.Leader;

public class KlassDTO {
    private final int id;
    private final String name;
    private final Leader leader;

    public KlassDTO(Klass klass) {
        this.id = klass.getId();
        this.name = klass.getName();
        this.leader = klass.getLeader();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Leader getLeader() {
        return leader;
    }
}

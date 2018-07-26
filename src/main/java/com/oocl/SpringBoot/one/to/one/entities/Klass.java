package com.oocl.SpringBoot.one.to.one.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Klass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JoinColumn(name = "leader_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Leader leader;

    public Klass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }
}

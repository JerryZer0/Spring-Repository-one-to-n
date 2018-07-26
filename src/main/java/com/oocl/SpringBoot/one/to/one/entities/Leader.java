package com.oocl.SpringBoot.one.to.one.entities;

import javax.persistence.*;

@Entity
public class Leader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String sex;

//    @JoinColumn(name = "klass_id")
//    @OneToOne(cascade = CascadeType.MERGE)
//    private Klass klass;

    public Leader() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

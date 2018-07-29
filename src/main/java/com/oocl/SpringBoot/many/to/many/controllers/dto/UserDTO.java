package com.oocl.SpringBoot.many.to.many.controllers.dto;

import com.oocl.SpringBoot.many.to.many.entities.Group;
import com.oocl.SpringBoot.many.to.many.entities.User;

import java.util.Set;

public class UserDTO {

    private final int id;
    private final String name;
    private final String sex;
    private final Set<Group> groups;

    UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.sex = user.getSex();
        this.groups = user.getGroups();
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

    public Set<Group> getGroups() {
        return groups;
    }
}

package com.oocl.SpringBoot.many.to.many.controllers.dto;

import com.oocl.SpringBoot.many.to.many.entities.Group;
import com.oocl.SpringBoot.many.to.many.entities.User;

import java.util.Set;

public class GroupDTO extends Group {

    private final int id;
    private final String name;
    private final Set<User> users;

    public GroupDTO(Group group) {
        this.id = group.getId();
        this.name = group.getName();
        this.users = group.getUsers();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<User> getUsers() {
        return users;
    }
}

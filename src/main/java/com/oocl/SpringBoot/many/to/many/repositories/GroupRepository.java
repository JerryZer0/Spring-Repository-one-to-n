package com.oocl.SpringBoot.many.to.many.repositories;

import com.oocl.SpringBoot.many.to.many.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {
    public Group findByName(String name);
}

package com.oocl.SpringBoot.many.to.many.repositories;

import com.oocl.SpringBoot.many.to.many.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Integer> {
}

package com.oocl.SpringBoot.many.to.many.repositories;

import com.oocl.SpringBoot.many.to.many.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

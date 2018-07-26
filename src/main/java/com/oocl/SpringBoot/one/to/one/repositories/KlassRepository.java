package com.oocl.SpringBoot.one.to.one.repositories;

import com.oocl.SpringBoot.one.to.one.entities.Klass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlassRepository extends JpaRepository<Klass,Integer> {
}

package com.oocl.SpringBoot.one.to.one.repositories;

import com.oocl.SpringBoot.one.to.one.entities.Leader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderRepository extends JpaRepository<Leader,Integer> {
}

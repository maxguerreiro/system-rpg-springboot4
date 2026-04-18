package com.rpg.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg.system.domain.ArmorSet;

@Repository
public interface ArmorSetRepository extends JpaRepository<ArmorSet, Long>{

}

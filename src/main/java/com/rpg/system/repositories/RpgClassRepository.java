package com.rpg.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg.system.domain.RpgClass;

@Repository
public interface RpgClassRepository extends JpaRepository<RpgClass, Long>{

}

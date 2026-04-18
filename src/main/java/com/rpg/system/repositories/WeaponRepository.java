package com.rpg.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg.system.domain.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long>{

}

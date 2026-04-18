package com.rpg.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg.system.domain.RpgCharacter;

@Repository
public interface RpgCharacterRepository extends JpaRepository<RpgCharacter, Long>{

}

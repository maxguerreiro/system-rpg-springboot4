package com.rpg.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpg.system.domain.RpgEquipment;

@Repository
public interface RpgEquipmentRepository extends JpaRepository<RpgEquipment, Long> {

}

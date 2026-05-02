package com.rpg.system.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.system.domain.Weapon;
import com.rpg.system.repositories.WeaponRepository;

@Service
public class WeaponService {

	@Autowired
	private WeaponRepository repo;
	
	public List<Weapon> findAll() {
		return repo.findAll();
	}
	
	public Weapon findById(Long id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Weapon not found"));
	}
	

	public Weapon upgradeWeapon(Long weaponId) {

        Weapon weapon = repo.findById(weaponId)
        		.orElseThrow(() -> new RuntimeException("Weapon not found"));

        if (weapon.getUpgradeLevel() == null) {
            weapon.setUpgradeLevel(0);
        }

        if (weapon.getUpgradeLevel() >= 25) {
            throw new RuntimeException("Weapon already at max level");
        }

        weapon.setUpgradeLevel(weapon.getUpgradeLevel() + 1);

        return repo.save(weapon);
    }
}

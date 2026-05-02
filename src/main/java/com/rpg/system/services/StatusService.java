package com.rpg.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.system.domain.ArmorSet;
import com.rpg.system.domain.RpgAttributes;
import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.RpgEquipment;
import com.rpg.system.domain.Weapon;
import com.rpg.system.domain.WeaponScaling;
import com.rpg.system.domain.dtos.CharacterStatusDTO;
import com.rpg.system.repositories.RpgCharacterRepository;

@Service
public class StatusService {
	
	@Autowired
	private RpgCharacterRepository repo;
	
	public CharacterStatusDTO getStatus(Long characterId) {
		
		RpgCharacter c = repo.findById(characterId)
				.orElseThrow(() -> new RuntimeException("Not found"));
		
		RpgAttributes attr = c.getAttributes();
		RpgEquipment eq = c.getEquipment();
		
		CharacterStatusDTO dto = new CharacterStatusDTO();
		
		// ❤️ BASE
		
		dto.setHp(attr.getVigor() * 30);
		dto.setFp(attr.getMind() * 5);
		dto.setStamina(attr.getEndurance() * 2);
		
		// ⚔️ ATAQUE
		
		dto.setAttackRight1(calcWeaponDamage(eq.getWeaponRight1(), attr));
		dto.setAttackLeft1(calcWeaponDamage(eq.getWeaponLeft1(), attr));
		
		// 🛡️ DEFESA
		
		applyArmorDefense(dto, eq.getArmorSet());
		
		// ⚖️ EQUIP LOAD
		
		calculateEquipLoad(dto, eq, attr);
		
		return dto;
	}

	private void applyArmorDefense(CharacterStatusDTO dto, ArmorSet armor) {

	    if (armor == null) return;

	    dto.setDefensePhysical(armor.getDefensePhysical());
	    dto.setDefenseMagic(armor.getDefenseMagic());
	    dto.setDefenseFire(armor.getDefenseFire());
	    dto.setDefenseLightning(armor.getDefenseLightning());
	    dto.setDefenseHoly(armor.getDefenseHoly());
	}

	private Integer calcWeaponDamage(Weapon weapon, RpgAttributes attr) {
		
		if(weapon == null) return 0;
		
		int base = weapon.getBaseDamage();
		int upgrade = weapon.getUpgradeLevel() != null ? weapon.getUpgradeLevel() : 0;
		
		int upgradedBase = base + (upgrade *10);
		
		WeaponScaling scaling = weapon.getScaling();
		
		int bonus = 0;
		
		bonus += attr.getStrength() * scaling.getStrength().getMultiplier();
		bonus += attr.getDexterity() * scaling.getDexterity().getMultiplier();
		bonus += attr.getIntelligence() * scaling.getIntelligence().getMultiplier();
		bonus += attr.getFaith() * scaling.getFaith().getMultiplier();
		bonus += attr.getArcane() * scaling.getArcane().getMultiplier();
		
		return (int) (upgradedBase + bonus * 10);
	}
	
	private void calculateEquipLoad(CharacterStatusDTO dto, RpgEquipment eq, RpgAttributes attr) {

	    int maxLoad = attr.getEndurance() * 3;
	    int currentLoad = 0;

	    if (eq.getArmorSet() != null) {
	        currentLoad += eq.getArmorSet().getWeight();
	    }

	    dto.setEquipLoadMax(maxLoad);
	    dto.setEquipLoadCurrent(currentLoad);

	    double ratio = (double) currentLoad / maxLoad;

	    if (ratio < 0.3) dto.setEquipLoadState("LIGHT");
	    else if (ratio < 0.7) dto.setEquipLoadState("MEDIUM");
	    else dto.setEquipLoadState("HEAVY");
	}

}

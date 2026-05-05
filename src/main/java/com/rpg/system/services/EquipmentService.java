package com.rpg.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.system.domain.RpgAttributes;
import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.Weapon;
import com.rpg.system.domain.WeaponRequirement;
import com.rpg.system.repositories.RpgCharacterRepository;
import com.rpg.system.repositories.WeaponRepository;

@Service
public class EquipmentService {

	@Autowired
	private RpgCharacterRepository charRepo;

	@Autowired
	private WeaponRepository weaponRepo;

	public RpgCharacter equipRightWeapon(Long characterId, Long weaponId) {

		RpgCharacter character = charRepo.findById(characterId)
				.orElseThrow(() -> new RuntimeException("Character not found"));

		Weapon weapon = weaponRepo.findById(weaponId).orElseThrow(() -> new RuntimeException("Weapon not found"));

		// validando requisitos
		validateRequirements(character.getAttributes(), weapon);

		character.getEquipment().setWeaponRight1(weapon);

		return charRepo.save(character);
	}

	public RpgCharacter equipLeftWeapon(Long characterId, Long weaponId) {

		RpgCharacter character = charRepo.findById(characterId)
				.orElseThrow(() -> new RuntimeException("Character not found"));

		Weapon weapon = weaponRepo.findById(weaponId).orElseThrow(() -> new RuntimeException("Weapon not found"));

		// validando requisitos
		validateRequirements(character.getAttributes(), weapon);

		character.getEquipment().setWeaponRight1(weapon);

		return charRepo.save(character);
	}

	private void validateRequirements(RpgAttributes attr, Weapon weapon) {

		WeaponRequirement req = weapon.getRequirements();

		if (req == null)
			return;

		if (attr.getStrength() != null && attr.getStrength() < req.getStrengthRequirement()) {
			throw new RuntimeException("Not enough Strength");
		}

		if (attr.getIntelligence() != null && attr.getStrength() < req.getIntelligenceRequirement()) {
			throw new RuntimeException("Not enough Inteligence");
		}

		if (attr.getFaith() != null && attr.getStrength() < req.getFaithRequirement()) {
			throw new RuntimeException("Not enough Faith");
		}

		if (attr.getDexterity() != null && attr.getStrength() < req.getDexterityRequirement()) {
			throw new RuntimeException("Not enough Dexterity");
		}

		if (attr.getArcane() != null && attr.getStrength() < req.getArcaneRequirement()) {
			throw new RuntimeException("Not enough Arcane");
		}

	}

}

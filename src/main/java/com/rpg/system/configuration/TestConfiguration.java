package com.rpg.system.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rpg.system.domain.ArmorSet;
import com.rpg.system.domain.BaseStats;
import com.rpg.system.domain.RpgAttributes;
import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.RpgClass;
import com.rpg.system.domain.RpgEquipment;
import com.rpg.system.domain.Weapon;
import com.rpg.system.repositories.ArmorSetRepository;
import com.rpg.system.repositories.RpgCharacterRepository;
import com.rpg.system.repositories.RpgClassRepository;
import com.rpg.system.repositories.RpgEquipmentRepository;
import com.rpg.system.repositories.WeaponRepository;

@Configuration
@Profile("test")
public class TestConfiguration implements CommandLineRunner {

	@Autowired
	private RpgCharacterRepository characterRepo;

	@Autowired
	private WeaponRepository weaponRepo;

	@Autowired
	private ArmorSetRepository armorRepo;

	@Autowired
	private RpgClassRepository classRepo;

	@Autowired
	private RpgEquipmentRepository equipmentRepo;

	@Override
	public void run(String... args) throws Exception {

		// 🗡️ Weapons
		Weapon staff = new Weapon(null, "Astrologer Staff", 30, "INT");
		Weapon sword = new Weapon(null, "Short Sword", 50, "STR/DEX");

		weaponRepo.saveAll(Arrays.asList(staff, sword));

		// 🛡️ Armor Sets
		ArmorSet mageSet = new ArmorSet(null, "Astrologer Set", 40, 60, 50, 45, 55, 10);
		ArmorSet knightSet = new ArmorSet(null, "Knight Set", 80, 40, 60, 50, 45, 25);

		armorRepo.saveAll(Arrays.asList(mageSet, knightSet));

		// 📊 Attributes
		RpgAttributes mageAttr = new RpgAttributes(9, 15, 9, 8, 12, 16, 7, 9);

		// 🧙 Class
		RpgClass astrologer = new RpgClass(null, "Astrologer", 6, mageAttr, null);

		classRepo.save(astrologer);

		// ⚔️ Equipment
		RpgEquipment eq = new RpgEquipment();
		eq.setWeaponRight1(staff);
		eq.setWeaponLeft1(sword);
		eq.setArmorSet(mageSet);

		equipmentRepo.save(eq);

		// ❤️ Base Stats
		BaseStats stats = new BaseStats(500, 100, 80, 40);

		// 🧍 Character
		RpgCharacter character = new RpgCharacter(null, "Personagem 1", 6, 1200, astrologer, stats, mageAttr, eq);

		characterRepo.save(character);

	}

}

package com.rpg.system.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.system.domain.BaseStats;
import com.rpg.system.domain.RpgAttributes;
import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.RpgClass;
import com.rpg.system.domain.RpgEquipment;
import com.rpg.system.domain.dtos.RpgCharacterDto;
import com.rpg.system.repositories.RpgCharacterRepository;
import com.rpg.system.repositories.RpgClassRepository;

@Service
public class RpgCharacterService {
	
	@Autowired
	private RpgCharacterRepository characterRepo;
	
	@Autowired
	private RpgClassRepository classRepo;
	
	// @return all characters
	public List<RpgCharacter> findAll() {
		return characterRepo.findAll();
	}
	
	// @Return character by id
	public RpgCharacter findById(Long id) {
		return characterRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
	
	//@creat a new character
	
	public RpgCharacter createCharacter(RpgCharacterDto dto) {
		
		// 🔍 1. Buscar classe
		RpgClass rpgClass = classRepo.findById(dto.getClassId())
				.orElseThrow(() -> new RuntimeException("Class not Found"));
		
		// 🧬 2. Clonar atributos
		RpgAttributes baseAttr = rpgClass.getBaseAttributes();
		
		RpgAttributes attributes = new RpgAttributes(
				baseAttr.getVigor(), 
				baseAttr.getMind(), 
				baseAttr.getEndurance(), 
				baseAttr.getStrength(), 
				baseAttr.getDexterity(), 
				baseAttr.getIntelligence(), 
				baseAttr.getFaith(), 
				baseAttr.getArcane());
		
		// ⚔️ 3. Criar equipamento inicial
		
		RpgEquipment equipment = new RpgEquipment();
		
		if(rpgClass.getStartingEquipment() != null) {
			RpgEquipment startEq = rpgClass.getStartingEquipment();
			equipment.setWeaponRight1(startEq.getWeaponRight1());
			equipment.setWeaponLeft1(startEq.getWeaponLeft1());
			equipment.setArmorSet(startEq.getArmorSet());
		}
		
		// ❤️ 4. Base stats iniciais
		BaseStats baseStats = new BaseStats(
				//hp
				attributes.getVigor() * 30,
				//fp
                attributes.getMind() * 5,
                //stamina
                attributes.getEndurance() * 2,
                //equipLoad
                attributes.getEndurance() * 3
                );
		
		// 🧍 5. Criar personagem
		RpgCharacter character = new RpgCharacter(null, dto.getName(), rpgClass.getBaseLevel(), 0, rpgClass, baseStats, attributes, equipment);
		
		System.out.println("Stats " + baseStats);
		System.out.println("Stats character" + character.getBaseStats());
		
		// 💾 6. Salvar (cascade salva equipment)
		return characterRepo.save(character);
	}

}

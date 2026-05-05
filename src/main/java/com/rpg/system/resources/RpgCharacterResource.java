package com.rpg.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.dtos.CharacterStatusDTO;
import com.rpg.system.domain.dtos.LevelUpDTO;
import com.rpg.system.domain.dtos.RpgCharacterDto;
import com.rpg.system.domain.dtos.RunesDto;
import com.rpg.system.enuns.AttributeType;
import com.rpg.system.services.EquipmentService;
import com.rpg.system.services.RpgCharacterService;
import com.rpg.system.services.RuneService;
import com.rpg.system.services.StatusService;

@RestController
@RequestMapping(value = "characters")
public class RpgCharacterResource {
	

	@Autowired
	private RpgCharacterService service;
	
	@Autowired
	private StatusService statusService;
	
	@Autowired
	private EquipmentService equipService;
	
	@Autowired
	private RuneService runeService;
	
	//Find all characters
	@GetMapping
	public ResponseEntity<List<RpgCharacter>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	//find by id
	@GetMapping("/{id}")
	public ResponseEntity<RpgCharacter> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	//create a new character
	
	@PostMapping
	public ResponseEntity<RpgCharacter> create(@RequestBody RpgCharacterDto dto) {
		RpgCharacter character = service.createCharacter(dto);
		return ResponseEntity.ok().body(character);
	}
	
	//update level
	
	@PostMapping("/{id}/level-up")
	public ResponseEntity<RpgCharacter> levelUp(@PathVariable Long id, @RequestBody LevelUpDTO dto) {
		
		AttributeType type = AttributeType.valueOf(dto.getAttribute().toUpperCase());
		
		RpgCharacter character = service.levelUp(id, type);
		
		return ResponseEntity.ok(character);
	}
	
	//get Status
	@GetMapping(value = "/{id}/status")
	public ResponseEntity<CharacterStatusDTO> getStatus(@PathVariable Long id) {
		CharacterStatusDTO dto = statusService.getStatus(id);
		return ResponseEntity.ok().body(dto);
	}
	
	
	// Equipar Weapon
	@PostMapping("/{id}/equip/right-weapon")
	public ResponseEntity<RpgCharacter> equipRightWeapon(
			@PathVariable Long id, 
			@RequestParam Long weaponId) {
		return ResponseEntity.ok(equipService.equipRightWeapon(id, weaponId));
	}
	
	//add runes
	
	@PostMapping("/{id}/add-runes")
	public ResponseEntity<RpgCharacter> addRunes(@PathVariable Long id, @RequestBody RunesDto dto) {
		
	RpgCharacter obj = runeService.addRunes(id, dto);
	return ResponseEntity.ok().body(obj);		
	}
	
	
	//attributes points (per rpg class)

}

package com.rpg.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.dtos.RpgCharacterDto;
import com.rpg.system.services.RpgCharacterService;

@RestController
@RequestMapping(value = "characters")
public class RpgCharacterResource {
	

	@Autowired
	private RpgCharacterService service;
	
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
	
	//update
	
	
	
	//attributes points (per rpg class)

}

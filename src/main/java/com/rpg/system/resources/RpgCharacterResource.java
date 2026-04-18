package com.rpg.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.repositories.RpgCharacterRepository;

@RestController
@RequestMapping(value = "characters")
public class RpgCharacterResource {
	
	//Mok
	@Autowired
	RpgCharacterRepository repoMok;
	
	@GetMapping
	public ResponseEntity<List<RpgCharacter>> findAll() {
		List<RpgCharacter> list = repoMok.findAll();
		return ResponseEntity.ok().body(list);
	}

}

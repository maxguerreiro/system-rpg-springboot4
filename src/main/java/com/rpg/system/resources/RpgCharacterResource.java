package com.rpg.system.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.RpgCharacter;

@RestController
@RequestMapping(value = "characters")
public class RpgCharacterResource {
	
	@GetMapping
	public ResponseEntity<RpgCharacter> find() {
		RpgCharacter c = new RpgCharacter(null, "Test", 99, 999, 1, null, null, null);
		return ResponseEntity.ok().body(c);
	}

}

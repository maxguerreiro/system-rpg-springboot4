package com.rpg.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.system.domain.RpgCharacter;
import com.rpg.system.domain.dtos.RunesDto;
import com.rpg.system.repositories.RpgCharacterRepository;

@Service
public class RuneService {

	@Autowired
	private RpgCharacterRepository repo;
	
	public int calculateCost(Integer level) {
		System.out.println(level + "################################");
		return 100 + (level * level * 20);
	}
	
	public RpgCharacter addRunes(Long id, RunesDto amount) {
		RpgCharacter character = repo.findById(id)
				.orElseThrow(()-> new RuntimeException("Character not found"));
		
		character.addRunes(amount.getAmount());
		
		return character;
	}
}

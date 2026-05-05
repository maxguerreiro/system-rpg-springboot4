package com.rpg.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.RpgClass;
import com.rpg.system.repositories.RpgClassRepository;

@RestController
@RequestMapping("classes")
public class RpgClassResource {
	
	@Autowired
	private RpgClassRepository repo;
	
	@GetMapping
	public ResponseEntity<List<RpgClass>> findAll(){
		return ResponseEntity.ok().body(repo.findAll());
	}

}

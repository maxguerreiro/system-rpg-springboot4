package com.rpg.system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rpg.system.domain.Weapon;
import com.rpg.system.services.WeaponService;

@RestController
@RequestMapping("/weapons")
public class WeaponResource {
	
	
	@Autowired
    private WeaponService service;
	
	@GetMapping
	public ResponseEntity<List<Weapon>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	 @PostMapping("/{id}/upgrade")
	    public ResponseEntity<Weapon> upgrade(@PathVariable Long id) {
	        return ResponseEntity.ok(service.upgradeWeapon(id));
	    }
	}

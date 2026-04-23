package com.rpg.system.services;

import org.springframework.stereotype.Service;

@Service
public class RuneService {

	public int calculateCost(Integer level) {
		System.out.println(level + "################################");
		return 100 + (level * level * 20);
	}
}

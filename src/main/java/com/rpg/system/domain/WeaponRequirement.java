package com.rpg.system.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class WeaponRequirement {

	private Integer strengthRequirement;
	private Integer dexterityRequirement;
	private Integer intelligenceRequirement;
	private Integer faithRequirement;
	private Integer arcaneRequirement;

	public WeaponRequirement() {
	}

	public WeaponRequirement(Integer strengthRequirement, Integer dexterityRequirement, Integer intelligenceRequirement,
			Integer faithRequirement, Integer arcaneRequirement) {
		super();
		this.strengthRequirement = strengthRequirement;
		this.dexterityRequirement = dexterityRequirement;
		this.intelligenceRequirement = intelligenceRequirement;
		this.faithRequirement = faithRequirement;
		this.arcaneRequirement = arcaneRequirement;
	}

	public Integer getStrengthRequirement() {
		return strengthRequirement;
	}

	public void setStrengthRequirement(Integer strengthRequirement) {
		this.strengthRequirement = strengthRequirement;
	}

	public Integer getDexterityRequirement() {
		return dexterityRequirement;
	}

	public void setDexterityRequirement(Integer dexterityRequirement) {
		this.dexterityRequirement = dexterityRequirement;
	}

	public Integer getIntelligenceRequirement() {
		return intelligenceRequirement;
	}

	public void setIntelligenceRequirement(Integer intelligenceRequirement) {
		this.intelligenceRequirement = intelligenceRequirement;
	}

	public Integer getFaithRequirement() {
		return faithRequirement;
	}

	public void setFaithRequirement(Integer faithRequirement) {
		this.faithRequirement = faithRequirement;
	}

	public Integer getArcaneRequirement() {
		return arcaneRequirement;
	}

	public void setArcaneRequirement(Integer arcaneRequirement) {
		this.arcaneRequirement = arcaneRequirement;
	}

	
}

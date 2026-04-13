package com.rpg.system.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class RpgAttributes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer vigor;
	private Integer mind;
	private Integer endurance;
	private Integer strength;
	private Integer dexterity;
	private Integer intelligence;
	private Integer faith;
	private Integer arcane;
	
	public RpgAttributes() {
	}

	public RpgAttributes(Integer vigor, Integer mind, Integer endurance, Integer strength, Integer dexterity,
			Integer intelligence, Integer faith, Integer arcane) {
		super();
		this.vigor = vigor;
		this.mind = mind;
		this.endurance = endurance;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.faith = faith;
		this.arcane = arcane;
	}

	public Integer getVigor() {
		return vigor;
	}

	public void setVigor(Integer vigor) {
		this.vigor = vigor;
	}

	public Integer getMind() {
		return mind;
	}

	public void setMind(Integer mind) {
		this.mind = mind;
	}

	public Integer getEndurance() {
		return endurance;
	}

	public void setEndurance(Integer endurance) {
		this.endurance = endurance;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getDexterity() {
		return dexterity;
	}

	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getFaith() {
		return faith;
	}

	public void setFaith(Integer faith) {
		this.faith = faith;
	}

	public Integer getArcane() {
		return arcane;
	}

	public void setArcane(Integer arcane) {
		this.arcane = arcane;
	}
}

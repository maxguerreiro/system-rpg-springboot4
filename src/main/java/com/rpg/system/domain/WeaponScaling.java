package com.rpg.system.domain;

import java.io.Serializable;

import com.rpg.system.enuns.ScalingGrade;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class WeaponScaling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private ScalingGrade strength;

	@Enumerated(EnumType.STRING)
	private ScalingGrade dexterity;

	@Enumerated(EnumType.STRING)
	private ScalingGrade intelligence;

	@Enumerated(EnumType.STRING)
	private ScalingGrade faith;

	@Enumerated(EnumType.STRING)
	private ScalingGrade arcane;

	public WeaponScaling() {
		super();
	}

	public WeaponScaling(ScalingGrade strength, ScalingGrade dexterity, ScalingGrade intelligence, ScalingGrade faith,
			ScalingGrade arcane) {
		super();
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.faith = faith;
		this.arcane = arcane;
	}

	public ScalingGrade getStrength() {
		return strength;
	}

	public void setStrength(ScalingGrade strength) {
		this.strength = strength;
	}

	public ScalingGrade getDexterity() {
		return dexterity;
	}

	public void setDexterity(ScalingGrade dexterity) {
		this.dexterity = dexterity;
	}

	public ScalingGrade getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(ScalingGrade intelligence) {
		this.intelligence = intelligence;
	}

	public ScalingGrade getFaith() {
		return faith;
	}

	public void setFaith(ScalingGrade faith) {
		this.faith = faith;
	}

	public ScalingGrade getArcane() {
		return arcane;
	}

	public void setArcane(ScalingGrade arcane) {
		this.arcane = arcane;
	}
	
	

}

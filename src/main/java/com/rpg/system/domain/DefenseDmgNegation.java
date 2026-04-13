package com.rpg.system.domain;

import java.io.Serializable;

public class DefenseDmgNegation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer defensePhysical;
	private Integer defenseMagic;
	private Integer defenseFire;
	private Integer defenseLightning;
	private Integer defenseHoly;
	private Integer weight;

	public DefenseDmgNegation() {
	}

	public DefenseDmgNegation(Integer defensePhysical, Integer defenseMagic, Integer defenseFire,
			Integer defenseLightning, Integer defenseHoly, Integer weight) {
		super();
		this.defensePhysical = defensePhysical;
		this.defenseMagic = defenseMagic;
		this.defenseFire = defenseFire;
		this.defenseLightning = defenseLightning;
		this.defenseHoly = defenseHoly;
		this.weight = weight;
	}

	public Integer getDefensePhysical() {
		return defensePhysical;
	}

	public void setDefensePhysical(Integer defensePhysical) {
		this.defensePhysical = defensePhysical;
	}

	public Integer getDefenseMagic() {
		return defenseMagic;
	}

	public void setDefenseMagic(Integer defenseMagic) {
		this.defenseMagic = defenseMagic;
	}

	public Integer getDefenseFire() {
		return defenseFire;
	}

	public void setDefenseFire(Integer defenseFire) {
		this.defenseFire = defenseFire;
	}

	public Integer getDefenseLightning() {
		return defenseLightning;
	}

	public void setDefenseLightning(Integer defenseLightning) {
		this.defenseLightning = defenseLightning;
	}

	public Integer getDefenseHoly() {
		return defenseHoly;
	}

	public void setDefenseHoly(Integer defenseHoly) {
		this.defenseHoly = defenseHoly;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
}

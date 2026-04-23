package com.rpg.system.domain.dtos;

import java.io.Serializable;

public class CharacterStatusDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer hp;
	private Integer fp;
	private Integer stamina;

	private Integer attackRight1;
	private Integer attackLeft1;

	private Integer defensePhysical;
	private Integer defenseMagic;
	private Integer defenseFire;
	private Integer defenseLightning;
	private Integer defenseHoly;

	private Integer equipLoadCurrent;
	private Integer equipLoadMax;
	private String equipLoadState;

	public CharacterStatusDTO() {
		super();
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getFp() {
		return fp;
	}

	public void setFp(Integer fp) {
		this.fp = fp;
	}

	public Integer getStamina() {
		return stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public Integer getAttackRight1() {
		return attackRight1;
	}

	public void setAttackRight1(Integer attackRight1) {
		this.attackRight1 = attackRight1;
	}

	public Integer getAttackLeft1() {
		return attackLeft1;
	}

	public void setAttackLeft1(Integer attackLeft1) {
		this.attackLeft1 = attackLeft1;
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

	public Integer getEquipLoadCurrent() {
		return equipLoadCurrent;
	}

	public void setEquipLoadCurrent(Integer equipLoadCurrent) {
		this.equipLoadCurrent = equipLoadCurrent;
	}

	public Integer getEquipLoadMax() {
		return equipLoadMax;
	}

	public void setEquipLoadMax(Integer equipLoadMax) {
		this.equipLoadMax = equipLoadMax;
	}

	public String getEquipLoadState() {
		return equipLoadState;
	}

	public void setEquipLoadState(String equipLoadState) {
		this.equipLoadState = equipLoadState;
	}

}

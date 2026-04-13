package com.rpg.system.domain;

import java.io.Serializable;

public class BaseStats implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer hp;
	private Integer fp;
	private Integer stamina;
	private Integer equipLoad;
	
	public BaseStats() {
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

	public Integer getEquipLoad() {
		return equipLoad;
	}

	public void setEquipLoad(Integer equipLoad) {
		this.equipLoad = equipLoad;
	}
}

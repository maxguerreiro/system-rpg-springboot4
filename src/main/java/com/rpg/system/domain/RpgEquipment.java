package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

public class RpgEquipment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Weapon weaponRight1;
	private Weapon weaponRight2;
	private Weapon weaponLeft1;
	private Weapon weaponLeft2;
	
	private ArmorSet armorSet;
	
	public RpgEquipment() {
	}

	public RpgEquipment(Long id, Weapon weaponRight1, Weapon weaponRight2, Weapon weaponLeft1, Weapon weaponLeft2,
			ArmorSet armorSet) {
		super();
		this.id = id;
		this.weaponRight1 = weaponRight1;
		this.weaponRight2 = weaponRight2;
		this.weaponLeft1 = weaponLeft1;
		this.weaponLeft2 = weaponLeft2;
		this.armorSet = armorSet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Weapon getWeaponRight1() {
		return weaponRight1;
	}

	public void setWeaponRight1(Weapon weaponRight1) {
		this.weaponRight1 = weaponRight1;
	}

	public Weapon getWeaponRight2() {
		return weaponRight2;
	}

	public void setWeaponRight2(Weapon weaponRight2) {
		this.weaponRight2 = weaponRight2;
	}

	public Weapon getWeaponLeft1() {
		return weaponLeft1;
	}

	public void setWeaponLeft1(Weapon weaponLeft1) {
		this.weaponLeft1 = weaponLeft1;
	}

	public Weapon getWeaponLeft2() {
		return weaponLeft2;
	}

	public void setWeaponLeft2(Weapon weaponLeft2) {
		this.weaponLeft2 = weaponLeft2;
	}

	public ArmorSet getArmorSet() {
		return armorSet;
	}

	public void setArmorSet(ArmorSet armorSet) {
		this.armorSet = armorSet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RpgEquipment other = (RpgEquipment) obj;
		return Objects.equals(id, other.id);
	}
}

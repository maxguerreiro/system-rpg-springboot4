package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_armor_set")
public class ArmorSet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer defensePhysical;
	private Integer defenseMagic;
	private Integer defenseFire;
	private Integer defenseLightning;
	private Integer defenseHoly;
	private Integer weight;
	
	public ArmorSet() {
	}

	public ArmorSet(Long id, String name, Integer defensePhysical, Integer defenseMagic, Integer defenseFire,
			Integer defenseLightning, Integer defenseHoly, Integer weight) {
		super();
		this.id = id;
		this.name = name;
		this.defensePhysical = defensePhysical;
		this.defenseMagic = defenseMagic;
		this.defenseFire = defenseFire;
		this.defenseLightning = defenseLightning;
		this.defenseHoly = defenseHoly;
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArmorSet other = (ArmorSet) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
}

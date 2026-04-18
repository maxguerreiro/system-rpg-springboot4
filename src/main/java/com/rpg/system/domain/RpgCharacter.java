package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_character")
public class RpgCharacter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer level;
	private Integer runesHeld;
	
	@ManyToOne
	@JoinColumn(name = "class_id")
	private RpgClass rpgClass;
	
	@Embedded
	private BaseStats baseStats;
	
	@Embedded
	private RpgAttributes attributes;
	
	@OneToOne
	@JoinColumn(name = "equipment_id")
	private RpgEquipment equipment;
	
	@OneToOne
	@JoinColumn(name = "armor_set_id")
	private ArmorSet armorSet;
	
	public RpgClass getRpgClass() {
		return rpgClass;
	}

	public void setRpgClass(RpgClass rpgClass) {
		this.rpgClass = rpgClass;
	}

	public ArmorSet getArmorSet() {
		return armorSet;
	}

	public void setArmorSet(ArmorSet armorSet) {
		this.armorSet = armorSet;
	}

	public RpgCharacter() {
	}

	public RpgCharacter(Long id, String name, Integer level, Integer runesHeld, RpgClass rpgClass, BaseStats baseStats, RpgAttributes attributes,
			RpgEquipment equipment) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.runesHeld = runesHeld;
		this.rpgClass = rpgClass;
		this.attributes = attributes;
		this.equipment = equipment;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getRunesHeld() {
		return runesHeld;
	}

	public void setRunesHeld(Integer runesHeld) {
		this.runesHeld = runesHeld;
	}

	public RpgClass rpgClass() {
		return rpgClass;
	}

	public void setClassId(RpgClass rpgClass) {
		this.rpgClass = rpgClass;
	}

	public BaseStats getBaseStats() {
		return baseStats;
	}

	public void setBaseStats(BaseStats baseStats) {
		this.baseStats = baseStats;
	}
	
	public RpgAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(RpgAttributes attributes) {
		this.attributes = attributes;
	}

	public RpgEquipment getEquipment() {
		return equipment;
	}

	public void setEquipment(RpgEquipment equipment) {
		this.equipment = equipment;
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
		RpgCharacter other = (RpgCharacter) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}


}

package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

public class RpgCharacter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer level;
	private Integer runesHeld;
	private Integer classId;
	
	private BaseStats baseStats;
	private RpgAttributes attributes;
	private RpgEquipment equipment;
	
	public RpgCharacter() {
	}

	public RpgCharacter(Long id, String name, Integer level, Integer runesHeld, Integer classId, BaseStats baseStats, RpgAttributes attributes,
			RpgEquipment equipment) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.runesHeld = runesHeld;
		this.classId = classId;
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

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
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

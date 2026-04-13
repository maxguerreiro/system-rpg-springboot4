package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

public class Weapon implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer baseDamage;
	private String scaling;
	
	public Weapon() {
		
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

	public Integer getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Integer baseDamage) {
		this.baseDamage = baseDamage;
	}

	public String getScaling() {
		return scaling;
	}

	public void setScaling(String scaling) {
		this.scaling = scaling;
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
		Weapon other = (Weapon) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	

}

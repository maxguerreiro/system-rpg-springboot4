package com.rpg.system.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_weapon")
public class Weapon implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer baseDamage;
	private String scaling;

	public Weapon(Long id, String name, Integer baseDamage, String scaling) {
		super();
		this.id = id;
		this.name = name;
		this.baseDamage = baseDamage;
		this.scaling = scaling;
	}

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

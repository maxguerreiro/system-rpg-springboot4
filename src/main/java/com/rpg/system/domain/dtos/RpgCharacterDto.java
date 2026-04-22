package com.rpg.system.domain.dtos;

import java.io.Serializable;

public class RpgCharacterDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Long classId;
	
	public RpgCharacterDto() {
	}

	public RpgCharacterDto(String name, Long classId) {
		super();
		this.name = name;
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public Long getClassId() {
		return classId;
	}
}

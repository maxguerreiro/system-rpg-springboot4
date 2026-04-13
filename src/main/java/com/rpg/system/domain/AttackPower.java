package com.rpg.system.domain;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AttackPower implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer armamanetRight1;
	private Integer armamentRight2;
	private Integer armamentLeft1;
	private Integer armamentLeft2;

	
	public AttackPower() {
	}


	public Integer getArmamanetRight1() {
		return armamanetRight1;
	}


	public void setArmamanetRight1(Integer armamanetRight1) {
		this.armamanetRight1 = armamanetRight1;
	}


	public Integer getArmamentRight2() {
		return armamentRight2;
	}


	public void setArmamentRight2(Integer armamentRight2) {
		this.armamentRight2 = armamentRight2;
	}


	public Integer getArmamentLeft1() {
		return armamentLeft1;
	}


	public void setArmamentLeft1(Integer armamentLeft1) {
		this.armamentLeft1 = armamentLeft1;
	}


	public Integer getArmamentLeft2() {
		return armamentLeft2;
	}


	public void setArmamentLeft2(Integer armamentLeft2) {
		this.armamentLeft2 = armamentLeft2;
	}
	
	
}

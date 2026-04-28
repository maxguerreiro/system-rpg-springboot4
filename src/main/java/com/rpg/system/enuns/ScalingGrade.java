
package com.rpg.system.enuns;

public enum ScalingGrade {
	
	S(1.0),
    A(0.8),
    B(0.6),
    C(0.4),
    D(0.25),
    E(0.1),
    NONE(0.0);
	
	private final double multiplier;

	ScalingGrade(double multiplier) {
		this.multiplier = multiplier;
	}
	
	public double getMultiplier() {
		return multiplier;
	}
}

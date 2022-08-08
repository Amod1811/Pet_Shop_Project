package com.bl.petshop;

public class Pigion extends Pet implements Flyable {
	
	public Pigion() {
		name = "Pigion";
		this.colour = colour.WHITE;
	}
	public void fly() {
		System.out.println("pigion flies");
	}
	}

package com.bl.petshop;

public class Cat extends Pet implements Swimable{

	public void swim() {
	System.out.println("Cat swims");
}
	public Cat() {
		this.name = "cat";
		this.colour =colour.BLACK_WHITE;
	}
}
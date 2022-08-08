package com.bl.petshop;

public class Duck extends Pet implements Swimable, Flyable {
	
	public void swim() {
		System.out.println("Duck swim");
}
}
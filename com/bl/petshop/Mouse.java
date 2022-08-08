package com.bl.petshop;

public class Mouse extends Pet implements Swimable{
	
	public Mouse() {
		name = "Mouse";
		colour = colour.BLACK_WHITE  ;
		
	}
	public void Swim() {
		System.out.println("Mouse swim");
	}
}
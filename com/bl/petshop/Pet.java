package com.bl.petshop;

import java.util.Objects;

public class Pet {
	enum Colour{
		RED, BLACK, WHITE, GREEN ,BROWN, BLACK_WHITE,GREY
		
	} 
	
	String id ;
	String name ;
	static Colour colour;
	int price;
	
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}

	
	private void petColour(Pet pet) {
		// TODO Auto-generated method stub
}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id);
	}

	public void eat() {
		System.out.println(getClass().getSimpleName()+"eats");
	}

}
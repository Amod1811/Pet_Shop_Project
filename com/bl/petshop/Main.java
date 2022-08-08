package com.bl.petshop;

public class Main {
	
	public static void handleUserSelection(int userChoice) {
		UserInterface userInterface = UserInterface.getInstatnce();
		switch (userChoice) {
		case 1 :
			userInterface.addPet();
			System.out.println("Pet added successfully");
			break;
		case 2 :
			userInterface.removePet();
			break;
		case 3 :
			userInterface.displayPet();
			break;
		case 4:
			userInterface.updatePet();
			break;
		default :	
			System.out.println("Thank you");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Pet Shop");
		UserInterface userInterface = UserInterface.getInstatnce();
		int userChoice = 0;
		while( userChoice != 6) {
			userChoice = userInterface.petShopMenu();
			handleUserSelection(userChoice);
		}
    }
}
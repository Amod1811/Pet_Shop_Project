package com.bl.petshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.bl.petshop.Pet.Colour;

public class UserInterface {
	ArrayList<Pet> petList = new ArrayList<Pet>();

	private static UserInterface userInterfaceInstance;

	private UserInterface() {

	}

	public static UserInterface getInstatnce() {
		if (userInterfaceInstance == null) {
			userInterfaceInstance = new UserInterface();
		}
		return userInterfaceInstance;
	}

	PetRepository petRepository = PetRepository.getInstance();

	public void printAllPets(Set<Pet> set) {
		for (Pet pet : set) {
			System.out.println(pet);
		}
	}

	public int petShopMenu() {
		System.out.println("\nPet Shop Menu : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. To add pet \n2. To remove pet \n3. To display the list \n4. Update pet \n5. To exit");
		int userInput = scanner.nextInt();
		return userInput;
	}

	public void addPet() {
		Scanner scanner = new  Scanner(System.in);
		Pet pet = new Pet();
		System.out.println("Enter animal Name : ");
		pet.name = scanner.next();
		
		System.out.println("Enter Aniamal id");
		pet.id = scanner.next();

		System.out.println("Enter animal Price : ");
		pet.price = scanner.nextInt();
		userInterfaceInstance.petColour(pet);
		petRepository.add(pet);

	}

	public void removePet() {
		System.out.println("Enter Pet name you want remove : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		Pet presentName = petRepository.getPet(id);
		petRepository.remove(presentName);
	}

	public void displayPet() {
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepository.getSet());
	}

	public void petColour(Pet pet) {
		System.out.println("Select colour from list : ");
		System.out.println(" \n1. RED \n2. BROWN \n3. BLACK \n4. GREEN \n5. WHITE \n6. BLACK_WHITE \n7. GREY ");

		Scanner scanner = new Scanner(System.in);
		int colour = scanner.nextInt();
		switch (colour) {
		case 1:
			pet.colour = Colour.RED;
			break;
		case 2:
			pet.colour = Colour.BROWN;
			break;
		case 3:
			pet.colour = Colour.BLACK;
			break;
		case 4:
			pet.colour = Colour.GREEN;
			break;
		case 5:
			pet.colour = Colour.WHITE;
			break;
		case 6:
			pet.colour = Colour.BLACK_WHITE;
			break;
		case 7:
			pet.colour = Colour.GREY;
			break;
		}
	}

	public void updatePet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of pet to update : ");
		String id = scanner.next();
		Pet pet = petRepository.getPet(id);
		System.out.println("Enter option to update : ");
		System.out.println("1. Pet name \n2. Pet price \n3. Pet Color");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter name of pet : ");
			pet.name = scanner.next();
			petRepository.set.add(pet);
			System.out.println("Pet name updated successfully.");
			break;
		case 2:
			System.out.print("Enter price of pet : ");
			pet.price = scanner.nextInt();
			petRepository.set.add(pet);
			System.out.println("Pet price updated successfully.");
			break;
		case 3:
			System.out.print("Enter colour of pet : ");
			userInterfaceInstance.petColour(pet);
			petRepository.set.add(pet);
			System.out.println("Pet colour is updated successfully.");
			break;
		default:
			System.out.println("Thank you.");
		
		}
	}
}

	

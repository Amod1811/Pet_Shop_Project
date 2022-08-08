package com.bl.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PetRepository {
	private List<Pet> petList = new ArrayList<Pet>();
	Set<Pet> set = new  HashSet<Pet>();
	private static PetRepository petRepositoryInstance;
	
	 PetRepository() {
	
	
	}
	public static PetRepository getInstance() {
		if(petRepositoryInstance==null) {
			petRepositoryInstance = new PetRepository();
		}
		return petRepositoryInstance;
	}

	public Set getSet() {
		return set;
	}
	
	public void add(Pet pet) {
		set.add(pet);
	}
	public void remove(Pet pet) {
		set.remove(pet);
	}
	public Pet getPet(String id) {
//		for(Pet pet : set) {
//			if(petName.equals(petName)) {
//				
//			}
//		}
	return	petList.stream().filter(pet -> pet.name.equals(id)).findFirst().orElse(null);
		
	}
	public Pet getPetId(String petId) {
		for(Pet pet : petList) {
			if(pet.id.equals(petId)) {
				return pet;
			}
		}
		return null;
	}
	}


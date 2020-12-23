package com.tactfactory.javaniveau2.tps.tp4.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Hobby {

  COOKING,
  SPORTS,
  SWIMMING,
  MOTO_CROSS,
  BIKING,
  VIDEO_GAMES,
  PROGRAMMMING;

	static Random rand = new Random();
	
	public static void printList() {
		System.out.println("Liste des \"Hobby\":");
		for (Hobby h: Hobby.values()) {
			System.out.println(h);
		}
	}

	public static Hobby getRandom() {
		return Hobby.values()[rand.nextInt(Hobby.values().length)];
		
	}

	public static List<Hobby> getRandoms() {
		
		List<Hobby> hobbies = Arrays.asList(Hobby.values());
		Collections.shuffle(hobbies);
		
		int r = rand.nextInt((Hobby.values().length));
		for (int i = 0; i < r+1; i++) {
			
			List<Hobby> hobbies2 =new ArrayList<>().add(hobbies[i],i);
		}
		return hobbies2;
	}
	
}

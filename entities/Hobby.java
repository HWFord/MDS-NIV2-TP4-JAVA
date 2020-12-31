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
		Random random = new Random();
		List<Hobby> hobbies = Arrays.asList(Hobby.values());
		Collections.shuffle(hobbies);
		List<Hobby> hobbies2 = new ArrayList<>();
		int nextRandom;
		try{
			for (int i = 0; i < 7; i++) {
			nextRandom = random.nextInt(7 - i);
	        hobbies2.add(hobbies.get(nextRandom));
	        hobbies.remove(nextRandom);
			}
		}catch(Exception e) {
				System.out.println("UnsupportedOperationException");
			}
		return hobbies2;
	}
//	public static ArrayList<Hobby> getRandoms() {
//		Random random = new Random();
//		int numOfElements = random.nextInt(7);
//		Hobby[] hobbies = Hobby.values();
//		ArrayList<Hobby> hobbies2 = new arrayList<>();
//		try {
//			for (int i = 0; i < numOfElements; i++) {
//				int randomIndex = random.nextInt(hobbies.size());
//				hobbies2.addAll(Arrays.asList(hobbies.get(randomIndex))); 
//				hobbies.remove(randomIndex); 
//			}
//		}catch(Exception e){
//			System.out.println("UnsupportedOperationException");
//		}
//		return hobbies2;
//	}
	
}

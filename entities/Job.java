package com.tactfactory.javaniveau2.tps.tp4.entities;

import java.util.Random;

public enum Job {

  DEVELOPER,
  MANAGER,
  ACCOUNTING,
  HUMAN_RESOURCES;
	
	public static void printList() {
		System.out.println("Liste des \"Job\":");
		for (Job j: Job.values()) {
			System.out.println(j);
		}
	}
	
	public static Job getRandom() {
		return Job.values()[new Random().nextInt(Job.values().length)];
		
	}
}

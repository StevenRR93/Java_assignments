/*
 *Steven Ramirez
 *ECE 251
 *Assignment 3
 *February 21, 2013
 */

import java.util.ArrayList;
import java.util.Iterator;
public class Fisherperson {
	// define instance variables
	private String name;
	private ArrayList<Fish> fishCaught  = new ArrayList<Fish>();;
	public static final int LIMIT = 3;
	public static final int MIN_KEEP_FISH_SIZE = 10;

	// create constructors
	public Fisherperson() {
		name= "";
	}

	public Fisherperson(String aName) {
		name= aName;
	}

	// create default toString
	public String toString() {
		return (name + " with " + fishCaught.size() + " fish");
	}

	// create get methods
	public String getName() {
		return name;
	}

	public ArrayList<Fish> getFishCaught() {
		return fishCaught;
	}

	public int getNumFishCaught() {
		return fishCaught.size();
	}

	
	//create a method that determines if the fish caught should be kept
	public boolean shouldKeep(Fish a) {
		if ((a.getSize() <= MIN_KEEP_FISH_SIZE || fishCaught.size() >= LIMIT)) {
			return false;
		}
		return true;
	}

	// create a method to remove a fish caught and add it to the lake
	public void throwBackFish(Lake a) {
		Iterator<Fish> fishIterator = fishCaught.iterator();
		while (fishIterator.hasNext()) {
			Fish loseFish = (Fish)fishIterator.next();
			a.add(loseFish);
		}
		fishCaught.clear();
	}

	// create a method to add a fish caught
	public void tryToCatchFishIn(Lake a) {
		Fish temp = a.getHungryFish();
		if (temp != null){
		if (shouldKeep(temp)) {
					fishCaught.add(temp); }
		else {
			temp.setHungry(false);
			a.add(temp);
		}}
	}

	// create a method to list the fish caught
	public void listFishCaught() {
		System.out.println("Fish that " + name + " has: ");
			if (fishCaught.size() != 0 && fishCaught != null) {
				for (Fish fc: fishCaught)
					System.out.println(fc);}
		else
			System.out.println("NONE");
	}
}

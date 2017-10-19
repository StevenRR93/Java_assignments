/*
 *Steven Ramirez
 *ECE 251
 *Assignment 3
 *February 21, 2013
 */

public class Lake {
	// define instance variables
	private String name;
	private Fish[] fish;
	private int capacity;
	private int numFish;

	// create constructors
	public Lake() {
		this("", 0);
		fish = new Fish[capacity];
	}

	public Lake(String aName, int aCapacity) {
		name = aName;
		capacity = aCapacity;
		fish = new Fish[capacity];
	}

	// create default toString
	public String toString() {
		return (name + " containing " + numFish + " fish");
	}

	public String getName() {
		return name;
	}

	public int getNumFish() {
		return numFish;
	}

	// create method to determine whether the lake is full
	public boolean isFull() {
		if (numFish < capacity) {
			return false;
		}
		return true;
	}

	// create method to add fish to the lake
	public void add(Fish afish) {
		if (!isFull()) {
			for (int i = 0; i < capacity; i++) {
				if (fish[i] == null) {
					fish[i] = afish.clone();
					numFish++;
					break;
				}
			}
		}
	}

	// create method to search for first hungry fish
	public Fish getHungryFish() {
		for (int i = 0; i < capacity; i++) {
			if (fish[i] != null && fish[i].isHungry()) {
				Fish hungryfish = fish[i].clone();
				fish[i] = null;
				numFish--;
				hungryfish.setHungry(false);
				return hungryfish;
			}
		}
		return null;
	}

	// create method to list fish
	public void listFish() {
		System.out.println(getName() + " containing " + getNumFish()
				+ " fish as follows: ");
		for (int i = 0; i < capacity; i++) {
			if (fish[i] != null && fish[i].isHungry()) {
				System.out.println(i + " - A hungry " + fish[i].getSize()
						+ " cm " + fish[i].getSpecies());
			} else if (fish[i] != null && !(fish[i].isHungry())) {
				System.out.println(i + " - A full " + fish[i].getSize()
						+ " cm " + fish[i].getSpecies());
			}
		}
	}
}
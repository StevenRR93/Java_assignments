/*
 *Steven Ramirez
 *ECE 251
 *Assignment 3
 *February 21, 2013
 */

public class Fisherperson {
	// define instance variables
	private String name;
	private Fish[] fishCaught;
	private int numFishCaught;
	public static final int LIMIT = 3;
	public static final int MIN_KEEP_FISH_SIZE = 10;

	// create constructors
	public Fisherperson(String name, int numFishCaught) {
		this.name = name;
		this.numFishCaught = numFishCaught;
		fishCaught = new Fish[LIMIT];
	}

	public Fisherperson(String aName) {
		this(aName, 0);
		fishCaught = new Fish[LIMIT];
	}

	public Fisherperson(){
		this("", 0);
		fishCaught = new Fish[LIMIT];
	}
	
	// create default toString
	public String toString() {
		return (name + " with " + numFishCaught + " fish");
	}

	// create get methods
	public String getName() {
		return name;
	}

	public Fish[] getFishCaught() {
		return fishCaught;
	}

	public int getNumFishCaught() {
		return numFishCaught;
	}

	//create a method to determine whether a fish caught should be kept
	public boolean shouldKeep(Fish a) {
		if ((a.getSize() <= MIN_KEEP_FISH_SIZE || numFishCaught >= LIMIT) && a != null) {
			return false;
		}
		return true;
	}

	// create a method to remove a fish caught and add it to the lake
	public void throwBackFish(Lake a) {
		for (int i = LIMIT - 1; i >= 0; i--) {
			if (fishCaught[i] != null && !a.isFull()) {
				a.add(fishCaught[i]);
				fishCaught[i] = null;
				numFishCaught--;
			}
		}

	}

	// create a method to add a fish caught
	public void tryToCatchFishIn(Lake a) {
		Fish temp = a.getHungryFish();
		if (temp != null){
		if (shouldKeep(temp)) {
			for (int i = 0; i < LIMIT; i++) {
				if (fishCaught[i] == null) {
					fishCaught[i] = temp;
					numFishCaught++;
					break;
				}
			}
		} else {
			temp.setHungry(false);
			a.add(temp);
		}}
	}

	// create a method to list the fish caught
	public void listFishCaught() {
		System.out.println("Fish that " + name + " has: ");
		if (numFishCaught != 0) {
			for (int i = 0; i < numFishCaught; i++)
				if (fishCaught[i] != null)
					System.out.println(fishCaught[i]);
		} else
			System.out.println("NONE");
	}
}

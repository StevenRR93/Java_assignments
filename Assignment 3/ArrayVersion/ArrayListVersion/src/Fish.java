/*
 *Steven Ramirez
 *ECE 251
 *Assignment 3
 *February 21, 2013
 */

public class Fish {
	private String species;
	private int size;
	private boolean hungry;

	// create constructors
	public Fish() {
		this(0, "", true);
	}

	public Fish(int aSize, String aSpecies) {
		this(aSize, aSpecies, true);
	}

	public Fish(int aSize, String aSpecies, boolean aHungry) {
		size = aSize;
		species = aSpecies;
		hungry = aHungry;
	}

	// create default toString
	public String toString() {
		if (isHungry())
			return ("A hungry " + getSize() + " cm " + getSpecies());
		else
			return ("A full " + getSize() + " cm " + getSpecies());
	}

	// create get methods
	public String getSpecies() {
		return species;
	}

	public int getSize() {
		return size;
	}

	public boolean isHungry() {
		return hungry;
	}

	// create set methods
	public void setSpecies(String aSpecies) {
		species = aSpecies;
	}

	public void setSize(int aSize) {
		size = aSize;
	}

	public void setHungry(boolean aHungry) {
		hungry = aHungry;
	}

}
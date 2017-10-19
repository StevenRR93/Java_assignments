/*
 *Steven Ramirez
 *ECE 251
 *Assignment 3
 *February 21, 2013
 */

//test Fish and Lake classes
public class LakeTest {
	public static void main(String args[]) {
		// create a new lake
		Lake silverlake = new Lake("Silver Lake", 3);
		// add fish to the lake
		silverlake.add(new Fish(35, "Pike", true));
		silverlake.add(new Fish(6, "Sunfish", false));
		silverlake.add(new Fish(10, "Bass", false));
		System.out.println(silverlake);
		// list the fish
		silverlake.listFish();
		// remove hungry fish
		silverlake.getHungryFish();
		silverlake.getHungryFish();
		// list the fish
		silverlake.listFish();

		System.out.println();
		// create a new lake
		Lake whitelake = new Lake("Whitelake", 8);
		// add fish to the lake
		whitelake.add(new Fish(30, "Pike", false));
		whitelake.add(new Fish(20, "Catfish", false));
		whitelake.add(new Fish(22, "Pike", true));
		whitelake.add(new Fish(14, "Fish", true));
		whitelake.add(new Fish(25, "Pickeral", false));
		whitelake.add(new Fish(18, "Bass", false));
		whitelake.add(new Fish(50, "Sunfish", true));
		whitelake.add(new Fish(45, "Musky", true));
		System.out.println(whitelake);
		// list the fish
		whitelake.listFish();
		// remove all hungry fish
		for (int i = 0; i < whitelake.getNumFish(); i++) {
			Fish a = whitelake.getHungryFish();
			if (a == null) {
				System.out.println("No more hungry fish.");
				break;
			}
		}
		// list the fish
		whitelake.listFish();

		// test fish class
		System.out.println();
		Fish f1 = new Fish(10, "Pike", true);
		Fish f2 = new Fish(10, "Pike", false);
		System.out.println(f1);
		System.out.println(f2);
	}
}

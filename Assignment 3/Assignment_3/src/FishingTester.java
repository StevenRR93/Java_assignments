
public class FishingTester {
	public static void main(String args[]) {
		Fisherperson john = new Fisherperson("John Smith");
		Fisherperson hugh = new Fisherperson("Generic Name");
		Lake dryLake = new Lake("Dry Lake", 0);
		System.out.println(dryLake);
		john.listFishCaught();
		System.out.println("John tries to catch a fish in Dry Lake");
		john.tryToCatchFishIn(dryLake);
		dryLake.listFish();
		john.listFishCaught();
		
		Lake fullLake = new Lake("Full Lake", 10);
		fullLake.add(new Fish(10, "Catfish", false));
		fullLake.add(new Fish(20, "Fish", false));
		fullLake.add(new Fish(30, "Carp", false));
		fullLake.add(new Fish(40, "Bass", false));
		fullLake.add(new Fish(50, "Shark", false));
		for (int i = 0; i < 2; i++) {
			System.out.println("John tries to catch a fish in White Lake");
			john.tryToCatchFishIn(fullLake);
			fullLake.listFish();
			john.listFishCaught();
		}
		
		Lake sunLake = new Lake("Sun Lake", 5);
		sunLake.add(new Fish(10, "Sunfish"));
		sunLake.add(new Fish(15, "Sunfish"));
		sunLake.add(new Fish(20, "Sunfish"));
		sunLake.add(new Fish(25, "Sunfish"));
		sunLake.add(new Fish(30, "Sunfish"));
		for (int i = 0; i < 3; i++) {
			System.out.println("Generic tries to catch a fish in White Lake");
			hugh.tryToCatchFishIn(sunLake);
			sunLake.listFish();
			hugh.listFishCaught();
		}
		
	}
}

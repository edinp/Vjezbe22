package animal;

public class Animal {
	
	private String nameAnimal;
	private Integer active;
	private Integer needWater;
	
	private static Integer place = 1;
	private static Integer thereIsWater = 1;
	
	public Animal(String name, Integer active, Integer water) {
		this.nameAnimal = name;
		this.active = active;
		this.needWater = water;
	}
	
	public void animalCondition (Animal a) {
		if (a.active == place && a.needWater <= thereIsWater) {
			System.out.println("It's fine. The Animal is active and has water.");
		} else if (a.active == place && a.needWater > thereIsWater) {
			System.out.println("The animal is active, but does not have enough water.");
		} else if (a.active != place && a.needWater <= thereIsWater) {
			System.out.println("The animal is not active, but has enough water.");
		} else if (a.active != place && a.needWater > thereIsWater) {
			System.out.println("The animal is not active and it does not have enough water.");
		}
	}
	
	public static void changeDay () {
		if (place == 1) {
			place = 2;
		} else 
			place = 1;
	}
	
//	public static void setWater (Integer a) {
//		if (a>=0 && a<=3) {
//			thereIsWater = a;
//		} else
//			System.out.println("Water set must be between 0 and 3.");
//	}
	
	public static void setWater () {
		if (thereIsWater < 3) {
			thereIsWater++;
		} else if (thereIsWater == 3) {
			thereIsWater = 0;
		}
	}

}
package RingAndUser;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("User count: " + User.userCount);
//		
//		User a = new User("Edin", "Pilavdzic", 33);
//		
//		System.out.println("User count: " + User.userCount);
//		
//		User b = new User("Azra", "Pilavdzic", 27);
//		
//		System.out.println("User count: " + User.userCount);
//		
//		System.out.println(a.getId() + ". " + a.getName());
//		
//		System.out.println(b.getId() + ". " + b.getName());
//		
//		System.out.println(a);
		
		Ring a = new Ring(10, 20, 5);
		System.out.println(a.getPositionX());
		a.setPositionX(15);
		System.out.println(a);
		
		Ring b = new Ring(20, 30, 3);
		System.out.println(b);
		
		Ring c = new Ring(40, 50, 2);
		System.out.println(c);
		
		if (a.equals(b)){
			System.out.println("Classic equal method from sysout: Equal");
		} else {
			System.out.println("Classic equal method from sysout: Not equal");
		}
		
		System.out.println("New equal method from class Spot: " + a.equals(b));
		
		System.out.println("Distance: " + a.getDistance(b));
		
		System.out.println("Both radiuses: " + (a.getRadius() + b.getRadius()));
		
		System.out.println("Does this rings intersect? " + a.intersect(b));
		
		a.setRadius(10);
		
		System.out.println("Distance: " + a.getDistance(b));
		
		System.out.println("Both radiuses: " + (a.getRadius() + b.getRadius()));
		
		System.out.println("Does this rings intersect? " + a.intersect(b));
	
	}

}

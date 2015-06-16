package Glass;

public class Main {

	public static void main(String[] args) {
		

		Glass g1 = new Glass(50);
		System.out.println(g1);
		
		g1.addLiquid(null, 20);
		System.out.println(g1);
		
		g1.addLiquid(null, 20);
		System.out.println(g1);
		
		g1.addLiquid("Kola", 20);
		System.out.println(g1);
		
		g1.emptyGlass();
		System.out.println(g1);

	}

}

package safe;

public class Main {

	public static void main(String[] args) {
	
		Safe s1 = new Safe("Crni fond");
		
		s1.addMoney(500);
		s1.leaveInSafe(0);
		s1.addMoney(20);
		s1.printInfo();
}
}

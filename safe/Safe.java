package safe;

public class Safe {
	
	private String safeName;
	private Integer moneyBalance;
	
	public Safe(String name){
		this.safeName = name;
		this.moneyBalance = 0;
	}
	
	public void addMoney (Integer money) {
		moneyBalance+=money;
		System.out.println("Added money! New money balance: " + moneyBalance + "\n" + printInfo());
	}
	
	public void leaveInSafe(Integer money){
		moneyBalance-=moneyBalance;
		money = moneyBalance;
		System.out.println("Taken all money! New balance: " + money + "\n");
	}
	
	public String printInfo() {
		String msg = "";
		if (moneyBalance == 0) {
			return msg = "It is empty!" + "\n";
		}
		else if (moneyBalance <= 20) {
			return msg = "There is some, but not much!" + "\n";
		}
		else if (moneyBalance > 20 && moneyBalance <= 100) {
			return msg = "There is some..." + "\n";
		}
		return msg = "There's a lot!!" + "\n";
	}
}


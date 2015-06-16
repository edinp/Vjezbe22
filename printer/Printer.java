package printer;

public class Printer {
	
	private String name;
	private Integer paper;
	private Integer ink;
	private Integer printed;
	
	private static Integer printedAll = 0;
	
//	public String toString() {
//		String s = name + " has " + paper + " paper in drawer, ";
//		s = s + "also has " + ink + " ink in reserve. ";
//		s = s + "So far, this printer printed " + getPrinted() + " pages.";
//		return s;
//	}
	
	public String toString() {
		String s = name + ":";
		if (ink > 3 && paper > 0) {
			s = s + " Ready. ";
		} else if (ink <3 && paper == 0) {
			s = s + " No ink nor paper. ";
		} else if (ink < 3) {
			s = s + " No ink. ";
		} else if (paper == 0) {
			s = s + " No paper. ";
		}
		return s;
	}
	
	public Printer() {
		this.name = "Default Printer";
		this.ink = 0;
		this.paper = 0;
		this.printed = 0;
	}
	
	public Printer(String name) {
		this.name = name;
		this.ink = 0;
		this.paper = 0;
		this.printed = 0;
	}
	
	public String getPrinterName() {
		return name;
	}
	
	public Integer getPrinted() {
		return printed;
	}
	
	public boolean anyInk() {
		if (ink > 0) {
			return true;
		}
		return false;
	}
	
	public boolean anyPaper() {
		if (paper > 0) {
			return true;
		}
		return false;
	}
	
	public Integer printedByPrinter (Printer a) {
		return printed;
	}
	
	public void addPaper (Integer a) {
		if (a > 100) {
			paper = 100;
			System.out.println("Added more paper than printer " + getPrinterName() + " can take! Paper in printer: " + paper);
		} else {
			paper+=a;
			System.out.println("Added paper! Paper in printer " + getPrinterName() + ": " + paper);
		}
	}
	
	public void addInk (Integer a) {
		if (a > 100) {
			ink = 100;
			System.out.println("Adder more ink than printer " + getPrinterName() + " can take. Ink in printer: " + ink);
		} else {
			ink+=a;
			System.out.println("Added ink! Ink in printer " + getPrinterName() + ": " + ink);
		}
	}
	
	public void printPages (Integer a) {
		if (a <= paper && a*3 <= ink) {
			paper-=a;
			ink=ink-(a*3);
			printed+=a;
			printedAll+=a;
			System.out.printf("\n" + "This printer %s printed %d pages of paper." + "\n" + "Ink balance %d, paper balance %d. " + "\n", getPrinterName(), a, ink, paper);
			System.out.println("Available pages for print for " + getPrinterName() + " is: " + howManyCanPrint());
			System.out.println("All printers printed total " + printedAll + " pages." + "\n");
		} else if (a*3 > ink && a > paper) {
			System.out.println("Printing not possible. Not enough ink and paper.");
		} else if (a*3 > ink) {
			System.out.println("Printing not possible. Too many pages for available amount of ink.");
		} else if (a > paper) {
			System.out.println("Printing not possible. To many pages for available amount of paper.");
		} 
	}
	
	public static Integer getPrintedAll() {
		return printedAll;
	}
	
	public Integer howManyCanPrint() {
		if (ink/3 >= paper) {
			return paper;
		} return ink/3;
	}
	
	

}

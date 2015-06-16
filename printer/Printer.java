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
	
	/**
	 * Transforms object to String
	 */
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
	
	/**
	 * Constructor for printer, with Default Printer name
	 */
	public Printer() {
		this.name = "Default Printer";
		this.ink = 0;
		this.paper = 0;
		this.printed = 0;
	}
	
	/**
	 * Constructor for printer, without name
	 * @param name - name to be set
	 */
	public Printer(String name) {
		this.name = name;
		this.ink = 0;
		this.paper = 0;
		this.printed = 0;
	}
	
	/**
	 * Returns printers name
	 * @return
	 */
	public String getPrinterName() {
		return name;
	}
	
	/**
	 * Returns number of printed pages by one printer
	 * @return
	 */
	public Integer getPrinted() {
		return printed;
	}
	
	/**
	 * Returns boolean if there is ink in one printer
	 * @return
	 */
	public boolean anyInk() {
		if (ink > 0) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Returns boolean if there is paper in one printer
	 * @return
	 */
	public boolean anyPaper() {
		if (paper > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Returns number of pages printed by wanted printer
	 * @param a
	 * @return
	 */
	public Integer printedByPrinter (Printer a) {
		return printed;
	}
	
	/**
	 * Adds paper to wanted printer
	 * @param a - number of paper pages added to printer
	 */
	public void addPaper (Integer a) {
		if (a > 100) {
			paper = 100;
			System.out.println("Added more paper than printer " + getPrinterName() + " can take! Paper in printer: " + paper);
		} else {
			paper+=a;
			System.out.println("Added paper! Paper in printer " + getPrinterName() + ": " + paper);
		}
	}
	
	/**
	 * Adds ink to wanted printer
	 * @param a - amount of ink added to printer
	 */
	public void addInk (Integer a) {
		if (a > 100) {
			ink = 100;
			System.out.println("Adder more ink than printer " + getPrinterName() + " can take. Ink in printer: " + ink);
		} else {
			ink+=a;
			System.out.println("Added ink! Ink in printer " + getPrinterName() + ": " + ink);
		}
	}
	
	/**
	 * Prints pages by wanted printer.
	 * Decreases amount of ink and number of blank pages.
	 * Also adds printed pages to sum of all printed pages by all printers.
	 * @param a
	 */
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
	
	/**
	 * Returns all printed pages by all printers
	 * @return
	 */
	public static Integer getPrintedAll() {
		return printedAll;
	}
	
	/**
	 * Returns number of available pages for print, 
	 * depending of available amount of ink
	 * and blank pages.
	 * @return
	 */
	public Integer howManyCanPrint() {
		if (ink/3 >= paper) {
			return paper;
		} return ink/3;
	}
	
	

}

package printer;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {
		

		Printer p1 = new Printer();
		System.out.println("Printed paper by " + p1.getPrinterName() + ": " + p1.printedByPrinter(p1));
		
		Printer p2 = new Printer("Home printer");
//		System.out.println("Printed paper by " + p2.getPrinterName() + ": " + p2.printedByPrinter(p2));
		
		p1.addPaper(101);
		p1.addInk(88);
		System.out.println("Printer " + p1.getPrinterName() + " can print max " + p1.howManyCanPrint() + " pages.");
		p1.printPages(29);
		
		p2.addPaper(30);
		p2.addInk(30);
		System.out.println("Printer " + p2.getPrinterName() + " can print max " + p2.howManyCanPrint() + " pages.");
		p2.printPages(5);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("Total printed: " + Printer.getPrintedAll());
		

	}

}

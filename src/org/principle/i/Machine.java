package org.principle.i;

public interface Machine {
	public void print();
	
	public void scan();
	
	public void fax();
}

class PrintingDevice implements Machine {

	@Override
	public void print() {
		// Printing is the functionality that printer does have
	}

	@Override
	public void scan() {
		// Since its only a printer and it doesn't supprot scanning
	}

	@Override
	public void fax() {
		// Pritner can't fax documtnts
	}
	
	//sinc Printer can't do scanning and fax document, its a bad practice to implement every method of 
	// machine interface
	//This is call breaking the interface segregation principle
}

class PhotoCopier implements Machine {

	@Override
	public void print() {
		// Printing is the functionality that printer does have
	}

	@Override
	public void scan() {
		// Photopier can scan documents
	}

	@Override
	public void fax() {
		// Pritner can't fax documtnts
	}
	
	//since Photocopier can't do fax document, its a bad practice to implement every method of 
	// machine interface
	//This is call breaking the interface segregation principle
}


//Solution by using Interface Segregation Principle

interface Printer {
	public void print();
}

interface Scanner {
	public void scan();
}

interface Fax {
	public void fax();
}

class OldFashionedPrinter implements Printer {

	@Override
	public void print() {
		// TODO Auto-generated method stub
	}
}

class NewFashionedPrinter implements Printer, Scanner {

	@Override
	public void scan() {
		// TODO Auto-generated method stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub	
	}
}

interface MultiPurposeDevice extends Printer, Scanner {
	
}

// this is example of Decorator Pattern
class MultiPurposePrinter implements MultiPurposeDevice {

	private Printer printer;
	private Scanner scanner;
	
	public MultiPurposePrinter(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}
	
	@Override
	public void print() {
		printer.print();
	}

	@Override
	public void scan() {
		scanner.scan();	
	}
}

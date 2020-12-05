package org.principle.l;


public class L {

	public static void main(String[] args) {
		
		Rectangle rc = new Rectangle(2,3);
		Demo.useIt(rc);
		
		//Breakig Libskov substitution principle
		Rectangle sq = new Square();
		sq.setWidth(5);
		Demo.useIt(sq);
		
		//Factory Design Patter
		Rectangle newRC = ShapeFactory.newRectangle(10, 5);
		Demo.useIt(newRC);
		
		Rectangle newSQ = ShapeFactory.newSquare(5);
		Demo.useIt(newRC);
	}
}



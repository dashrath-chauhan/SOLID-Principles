package org.principle.l;

public class Rectangle {
	int height;
	int width;
	
	public Rectangle() {}
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
	public int getArea() {
		return this.height * this.width;
	}
	
	// to check whether the rectangle is a square or not(extra class is not requied)
	
	public boolean isSquare() {
		return width == height;
	}
}

class Square extends Rectangle { 
	public Square() {}
	
	public Square(int size) {
		width = height = size;
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}
}

class Demo {
	static void useIt(Rectangle r) {
		int width = r.getWidth();
		r.setHeight(10);
		//area = width * 10
		System.out.println("Expected Area: "+(width*10)+", Got Area:"+r.getArea());
	}
}

class ShapeFactory {
	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width,height);
	}
	
	public static Rectangle newSquare(int size) {
		return new Square(size);
	}
}








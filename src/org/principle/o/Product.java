package org.principle.o;

import java.util.List;
import java.util.stream.Stream;

enum Color {
	RED, GREEN, BLUE
}

enum Size {
	SMALL, MEDIUM, LARGE, HUGE
}

public class Product {
	public String name;
	public Color color;
	public Size size;
	
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}

class ProductFilter {
	public Stream<Product> filterByColor(List<Product> products, Color color){
		return products.stream().filter(p -> p.color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products, Size size){
		return products.stream().filter(p -> p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color){
		return products.stream().filter(p -> p.size == size && p.color == color);
	}
}

class BetterProductFiler implements Filter<Product>{

	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
		return items.stream().filter(item -> specification.isSatisfied(item));
	}
}







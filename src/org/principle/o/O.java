package org.principle.o;

import java.util.ArrayList;
import java.util.List;

public class O {

	public static void main(String[] args) {
		Product apple = new Product("Apple",Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree",Color.GREEN, Size.LARGE);
		Product house = new Product("house",Color.BLUE, Size.LARGE);
		List<Product> products = new ArrayList<>();
		products.add(apple);
		products.add(tree);
		products.add(house);
		 
		ProductFilter pf = new ProductFilter();
		System.out.println("Green Products (old):");
		pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - "+p.name+ " is green."));
		System.out.println("Small Products (old):");
		pf.filterBySize(products, Size.SMALL).forEach(p -> System.out.println(" - "+p.name+ " is small."));
		System.out.println("Small Products and Green Products(old):");
		pf.filterBySizeAndColor(products, Size.SMALL, Color.GREEN).forEach(p -> System.out.println(" - "+p.name+ " is small and green."));
		
		BetterProductFiler bf = new BetterProductFiler();
		System.out.println("Green Products (new):");
		bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(item -> System.out.println(" - "+item.name+ " is green."));
		System.out.println("Large Products and Blue Products(new):");
		bf.filter(products, 
				new AndSpecification<>(
						new ColorSpecification(Color.BLUE), 
						new SizeSpecification(Size.LARGE)
				)).forEach(item -> System.out.println(" - "+item.name+ " is large and blue."));
	}
}


















package org.principle.o;

public interface Specification<T> {
	boolean isSatisfied(T item);
}

class ColorSpecification implements Specification<Product>{
	private Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}
	
	@Override
	public boolean isSatisfied(Product item) {
		return item.color == color;
	}
}

class SizeSpecification implements Specification<Product>{
	private Size size;
	
	public SizeSpecification(Size size) {
		this.size = size;
	}
	
	@Override
	public boolean isSatisfied(Product item) {
		return item.size == size;
	}
}

class AndSpecification<T> implements Specification<T>{
	
	private Specification<T> first, second;
	
	public AndSpecification(Specification<T> first, Specification<T> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}
	
}
















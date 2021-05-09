package factory.concreteclasses;

import factory.Product;

public class IndustrialProduct implements Product {

	@Override
	public void type() {
		System.out.println("Hey there !! I'm an industrial Product");
	}
}

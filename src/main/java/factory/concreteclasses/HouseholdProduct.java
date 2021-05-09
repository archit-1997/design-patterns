package factory.concreteclasses;

import factory.Product;

public class HouseholdProduct implements Product {

	@Override
	public void type() {
		System.out.println("Hi !!! I'm a household product");
	}
}

package factory;

import factory.concreteclasses.HouseholdProduct;
import factory.concreteclasses.IndustrialProduct;

public class ProductFactory {

	private String type;

	public ProductFactory(String type) {
		this.type = type;
	}

	public Product getProduct() {
		if (type.equalsIgnoreCase("household")) return new HouseholdProduct(); else if (
			type.equalsIgnoreCase("industrial")
		) return new IndustrialProduct(); else return null;
	}
}

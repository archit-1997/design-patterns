package factory;

public class ProductProvider {

	public static void main(String[] args) {
		String type = "Industrial";
		ProductFactory factory = new ProductFactory(type);

		Product newProduct = factory.getProduct();
		if (newProduct == null) System.out.println("Please specify the correct product type");

		newProduct.type();
	}
}

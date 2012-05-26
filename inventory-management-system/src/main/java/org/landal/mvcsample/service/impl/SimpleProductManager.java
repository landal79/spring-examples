package org.landal.mvcsample.service.impl;

import java.util.List;

import org.landal.mvcsample.domain.Product;
import org.landal.mvcsample.service.ProductManager;

public class SimpleProductManager implements ProductManager {

	private List<Product> products;

	public List<Product> getProducts() {
		// throw new UnsupportedOperationException();
		return products;
	}

	public void increasePrice(int percentage) {
		// throw new UnsupportedOperationException();
		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue()
						* (100 + percentage) / 100;
				product.setPrice(newPrice);
			}
		}
	}

	public void setProducts(List<Product> products) {
		// throw new UnsupportedOperationException();
		this.products = products;
	}

}

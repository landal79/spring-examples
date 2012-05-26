package org.landal.mvcsample.service;

import java.io.Serializable;
import java.util.List;

import org.landal.mvcsample.domain.Product;

public interface ProductManager extends Serializable {

	public void increasePrice(int percentage);

	public List<Product> getProducts();

}

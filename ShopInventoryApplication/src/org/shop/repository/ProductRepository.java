package org.shop.repository;

import org.shop.model.ProductModel;
import java.util.*;

public class ProductRepository {

	ArrayList al = new ArrayList();

	public boolean isAddProduct(ProductModel pModel) {
		Boolean b = al.add(pModel);
		if (b) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList getProductList() {
		return al.size() >= 0 ? al : null;
	}

	public ProductModel searchProduct(int id) {
		boolean b = false;
		ProductModel model = null;
		for (Object obj : al) {
			model = (ProductModel) obj;
			if (model.getId() == id) {
				b = true;
				break;
			}
		}
		return b ? model : null;
	}
}

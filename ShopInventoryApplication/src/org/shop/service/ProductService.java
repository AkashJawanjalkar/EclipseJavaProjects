package org.shop.service;

import org.shop.model.ProductModel;
import org.shop.repository.ProductRepository;
import java.util.*;

public class ProductService {

	ProductRepository prodRepo = new ProductRepository();

	public int isAddProduct(ProductModel pModel) {
		ArrayList al = prodRepo.getProductList();
		{
			boolean b = false;
			if (al != null) {
				for (Object obj : al) {
					ProductModel model = (ProductModel) obj;
					if (model.getName().equals(pModel.getName())) {
						b = true;
						break;
					}
				}
				if (b) {
					return 0;
				} else {
					b = prodRepo.isAddProduct(pModel);
					return b ? 1 : -1;
				}
			} else {
				return -1;
			}
		}

	}

	public ArrayList getProductList() {
		return prodRepo.getProductList();
	}

	public ProductModel searchProduct(int id) {
		return prodRepo.searchProduct(id);
	}
}

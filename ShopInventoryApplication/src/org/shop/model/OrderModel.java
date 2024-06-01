package org.shop.model;

public class OrderModel {

	private CustomerModel custModel;
	private ProductModel prod[];
	private int qty[];

	public CustomerModel getCustModel() {
		return custModel;
	}

	public void setCustModel(CustomerModel custModel) {
		this.custModel = custModel;
	}

	public void setProducts(ProductModel prod[]) {
		this.prod = prod;
	}

	public void setQuantity(int qty[]) {
		this.qty = qty;
	}
	public ProductModel[] getProducts()
	{
		return prod;
	}
	public int [] getQuantity()
	{
		return this.qty;
	}
	
	public void calBill() {
		System.out.println(custModel.getId() + "\t" + custModel.getName());
		System.out.println("-----------------------------------------------------");
		int grandTotal = 0;
		for (int i = 0; i < prod.length; i++) {
			int id = prod[i].getId();
			int price = prod[i].getPrice();
			String name = prod[i].getName();
			int total = price * qty[i];
			grandTotal = grandTotal + total;

			System.out.println(id + "\t" + price + "\t" + name);
		}
		System.out.println("Total order bill is " + grandTotal);
	}
}

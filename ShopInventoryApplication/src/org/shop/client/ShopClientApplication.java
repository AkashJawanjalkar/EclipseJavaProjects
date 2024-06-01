package org.shop.client;

import java.util.*;

import org.shop.model.CustomerModel;
import org.shop.model.OrderModel;
import org.shop.model.ProductModel;
import org.shop.service.OrderService;
import org.shop.service.ProductService;

public class ShopClientApplication {

	public static void main(String[] args) {

		ProductService prodService = new ProductService();
		OrderService oService = new OrderService();
		
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1: Add new Product \n2: Show All products \n3: searhc Product by id \n4: Place Order \n5: Show all orders");
			System.out.println("Enter Your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter product name, id and price ");
				xyz.nextLine();
				String name = xyz.nextLine();
				int id = xyz.nextInt();
				int price = xyz.nextInt();
				ProductModel pModel = new ProductModel(name, id, price);
				int result = prodService.isAddProduct(pModel);
				if (result == 1) {
					System.out.println("Product Added Successfully.......");
				} else if (result == -1) {
					System.out.println("there is no data found");
				} else {
					System.out.println("Already product is present in collection.....");
				}
				break;
			case 2:
				ArrayList al = prodService.getProductList();
				for (Object obj : al) {
					ProductModel model = (ProductModel) obj;
					System.out.println(model.getId() + "\t" + model.getName() + "\t" + model.getPrice());
				}
				break;
			case 3:
				System.out.println("Enter product id for search");
				id = xyz.nextInt();
				ProductModel model = prodService.searchProduct(id);
				if (model != null) {
					System.out.println(model.getId() + "\t" + model.getName() + "\t" + model.getPrice());
				} else {
					System.out.println("Model Not Found");
				}
				break;
			case 4:
				System.out.println("Enter order details");
				System.out.println("Enter customer details like as name, contact and id of customer");
				xyz.nextLine();
				name = xyz.nextLine();
				String contact = xyz.nextLine();
				id = xyz.nextInt();
				CustomerModel c = new CustomerModel(name, id, contact);
				System.out.println("Enter product count");
				int count = xyz.nextInt();
				ProductModel p[] = new ProductModel[count];
				int qty[] = new int[count];
				System.out.println("Enter product details like as name, id and price, quantity");
				for (int i = 0; i < p.length; i++) {
					p[i] = new ProductModel();
					xyz.nextLine();
					System.out.println("Enter product name, id , price and quantity");
					name = xyz.nextLine();
					id = xyz.nextInt();
					price = xyz.nextInt();
					int q = xyz.nextInt();
					p[i].setId(id);
					p[i].setName(name);
					p[i].setPrice(price);
					qty[i] = q;

				}
				OrderModel omodel = new OrderModel();
				omodel.setCustModel(c);
				omodel.setProducts(p);
				omodel.setQuantity(qty);
				
				boolean b = oService.isAddOrder(omodel);
				if (b) {
					System.out.println("Order place succesfully");
				} else {
					System.out.println("order not placed");
				}
				break;
			case 5:
				al = oService.getOrderList();
				for(Object obj:al)
				{
					OrderModel o = (OrderModel)obj;
					CustomerModel cmodel = o.getCustModel();
					ProductModel prods[] = o.getProducts();
					int []quantity = o.getQuantity();
					
					System.out.println(cmodel.getName()+"\t"+cmodel.getId()+"\t"+cmodel.getContact());
					System.out.println("===========================================================");
					int grandTotal =0;
					for(int i=0;i<prods.length;i++)
					{
						int total = quantity[i]+prods[i].getPrice();
						grandTotal = grandTotal+total;
						System.out.println(prods[i].getId()+"\t"+prods[i].getName()+"\t"+prods[i].getPrice());
					}
					System.out.println("==========================================");
					System.out.println("Grand Total is "+grandTotal);
				}
			default:
				System.out.println("Wrong choice");
			}
		} while (true);// infinite loop
	}

}

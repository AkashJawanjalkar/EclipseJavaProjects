package org.shop.repository;

import org.shop.model.OrderModel;
import java.util.*;

public class OrderRepository {
	ArrayList orderList = new ArrayList();

	public boolean isAddOrder(OrderModel model) {
		boolean b = orderList.add(model);
		if (b) {
			return true;
		} else {
			return false;
		}
	}
	public ArrayList getOrderList()
	{
		return orderList;
	}
}

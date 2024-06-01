package org.shop.service;

import java.util.ArrayList;

import org.shop.model.OrderModel;
import org.shop.repository.OrderRepository;

public class OrderService {
	OrderRepository orderRepo = new OrderRepository();

	public boolean isAddOrder(OrderModel omodel) {
		return orderRepo.isAddOrder(omodel);
	}
	public ArrayList getOrderList()
	{
		return orderRepo.getOrderList();
	}
}

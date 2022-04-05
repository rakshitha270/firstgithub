package com.cg.shopping.Client;

import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.service.IOrderService;
import com.cg.shopping.service.IOrderServiceImpl;

public class Client
{
	public static void main(String[] args) 
	{
		//CRUD operation of order
		OrderDetails order=new OrderDetails();
		IOrderService service= new IOrderServiceImpl();
		
		
		//create
		order.setId(1);
		order.setDateOfPurchase("01-03-2000");
		order.setTotal(20);
		order.setPaymentMode("cash");
		service.addOrder(order);
		System.out.println(" database created");
		}
}
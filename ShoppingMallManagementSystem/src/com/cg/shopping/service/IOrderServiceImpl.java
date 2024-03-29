package com.cg.shopping.service;


	
	import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.repositry.IOrderRepository;
import com.cg.shopping.repositry.IOrderRepositoryImpl;

	public class IOrderServiceImpl  implements IOrderService{
		
		private IOrderRepository dao;

		public IOrderServiceImpl() {
			dao=new IOrderRepositoryImpl();
		}

		@Override
		public OrderDetails addOrder(OrderDetails order) {
			dao.beginTransaction();
			dao.addOrder(order);
		dao.commitTransaction();

			return order;
		}

		@Override
		public OrderDetails updateOrder(OrderDetails order) {
			dao.beginTransaction();
			dao.updateOrder(order);
			dao.commitTransaction();

			return order;
		}

		

		

		//@Override
		//public Item addItem(Item item) {
		//	dao.beginTransaction();
			
			//dao.commitTransaction();

			//return null;
		//}

		@Override
		public OrderDetails searchOrder(int id) {
			OrderDetails order= dao.searchOrder(id);
			

			return order;
		}

		@Override
		public boolean cancelMall(int id) {
			// TODO Auto-generated method stub
			return false;
		}
		

	}


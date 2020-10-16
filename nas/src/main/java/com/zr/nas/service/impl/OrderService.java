package com.zr.nas.service.impl;

import java.util.List;

import com.zr.nas.dao.IOrderDao;
import com.zr.nas.dao.impl.OrderDao;
import com.zr.nas.pojo.Order;
import com.zr.nas.service.IOrderService;
/**
 * 订单的service实现类
 */
public class OrderService implements IOrderService{
	
	IOrderDao dao=new OrderDao();
	//显示订单信息
	@Override
	public List<Order> showOrderList() {
		
		return dao.showOrderList();
	}
	
	//按学号或者手机号查询订单信息
	@Override
	public List<Order> queryOrderList(String number) {
		
		return dao.queryOrderList(number);
	}

	//按时间查询信息
	@Override
	public List<Order> queryOrderListByTime(String start_date, String end_date) {
		
		return dao.queryOrderListByTime(start_date,end_date);
	}
	
	//显示订单详情信息
	@Override
	public List<Order> showOrderDetailList(String order_id) {
		
		return dao.showOrderDetailList(order_id);
	}

}

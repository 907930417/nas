package com.zr.nas.service;

import java.util.List;

import com.zr.nas.pojo.Order;
/**
 * 订单的Service接口
 */
public interface IOrderService {

	//显示订单信息
	List<Order> showOrderList();
	
	//按学号或者手机号查询订单信息
	List<Order> queryOrderList(String number);
	
	//按时间查询订单信息
	List<Order> queryOrderListByTime(String start_date, String end_date);

	//显示详细订单信息
	List<Order> showOrderDetailList(String order_id);

	
}

package com.zr.nas.dao.impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zr.nas.dao.IOrderDao;
import com.zr.nas.pojo.Order;
import com.zr.nas.utils.TxDBUtils;
/**
 * 订单的dao的实现类
 */
public class OrderDao implements IOrderDao{

	//显示所有的订单信息
	@Override
	public List<Order> showOrderList() {
		QueryRunner runner=new QueryRunner(TxDBUtils.getSource());
		String sql="select o.order_id,o.order_price,o.order_state,u.name user_name,u.phone user_phone,o.order_payMethod,o.order_createdate,o.remarks from nas_order o, nas_user u where u.id=o.u_id";
		try {
			List<Order> list = runner.query(sql, new BeanListHandler<Order>(Order.class));
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//按学号或者手机号查询信息
	@Override
	public List<Order> queryOrderList(String number) {
		QueryRunner runner=new QueryRunner(TxDBUtils.getSource());
		String sql="select o.order_id,o.order_price,o.order_state,u.name user_name,u.phone user_phone,o.order_payMethod,o.order_createdate,o.remarks from nas_order o, nas_user u where (u.id like ? or u.phone like ?) and u.id=o.u_id";
		String number1="%"+ number +"%";
		try {
			List<Order> list = runner.query(sql, new BeanListHandler<Order>(Order.class),number1,number1);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> queryOrderListByTime(String start_date, String end_date) {
		QueryRunner runner=new QueryRunner(TxDBUtils.getSource());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = formatter.parse(start_date);
			Date date2 = formatter.parse(end_date);
			String sql="select o.order_id,o.order_price,o.order_state,u.name user_name,u.phone user_phone,o.order_payMethod,o.order_createdate,o.remarks from nas_order o, nas_user u where o.order_createdate between ? and ? and u.id=o.u_id";
			List<Order> list = runner.query(sql, new BeanListHandler<Order>(Order.class),date1,date2);
			System.out.println(list);
			return list;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//显示订单的详情信息
	@Override
	public List<Order> showOrderDetailList(String order_id) {
		QueryRunner runner=new QueryRunner(TxDBUtils.getSource());
		String sql="select g.goods_name,g.goods_price,e.emp_name,o.remarks from nas_employee e,nas_goods g,nas_order o where o.good_id=g.id and o.employee_id=e.id and o.order_id=?";
		try {
			List<Order> list = runner.query(sql, new BeanListHandler<Order>(Order.class),order_id);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

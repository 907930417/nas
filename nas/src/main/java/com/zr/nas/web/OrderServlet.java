package com.zr.nas.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.zr.nas.pojo.Order;
import com.zr.nas.service.IOrderService;
import com.zr.nas.service.impl.OrderService;

/**
 * 和订单相关的Servlet
 * 先继承BaseServlet
 */
public class OrderServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * 显示所有的订单信息
	 * @param req
	 * @param resp
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String showOrderList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IOrderService service = new OrderService();
		List<Order> list = new ArrayList<Order>();
		list=service.showOrderList();
		
		JSONArray array=new JSONArray(list);
		String jsonString=array.toString();//将jisn转换为字符串
		resp.getWriter().print(jsonString);//返回json信息
		
		return null;
	}
	
	/**
	 * 按学号或者手机号查询订单信息
	 * @param req
	 * @param resp
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String queryOrderList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IOrderService service = new OrderService();
		List<Order> list = new ArrayList<Order>();
		String number=req.getParameter("number");
		list=service.queryOrderList(number);
		
		JSONArray array=new JSONArray(list);
		String jsonString=array.toString();//将jisn转换为字符串
		resp.getWriter().print(jsonString);//返回json信息
		
		return null;
	}
	
	/**
	 * 按时间查询订单信息
	 * @param req
	 * @param resp
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String queryOrderListByTime(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IOrderService service = new OrderService();
		List<Order> list = new ArrayList<Order>();
		String start_date=req.getParameter("start_date");
		String end_date=req.getParameter("end_date");
		list=service.queryOrderListByTime(start_date,end_date);
		
		JSONArray array=new JSONArray(list);
		String jsonString=array.toString();//将jisn转换为字符串
		resp.getWriter().print(jsonString);//返回json信息
		
		return null;
	}
	
	/**
	 * 显示订单详细信息
	 * @param req
	 * @param resp
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String showOrderDetailList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IOrderService service = new OrderService();
		List<Order> list = new ArrayList<Order>();
		String order_id=req.getParameter("order_id");
		list=service.showOrderDetailList(order_id);
		System.out.println(list);
		JSONArray array=new JSONArray(list);
		String jsonString=array.toString();//将jisn转换为字符串
		resp.getWriter().print(jsonString);//返回json信息
		
		return null;
	}

}

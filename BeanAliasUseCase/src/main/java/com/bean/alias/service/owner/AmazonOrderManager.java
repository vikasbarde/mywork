package com.bean.alias.service.owner;

import com.bean.alias.service.model.AmazonOrder;
import com.bean.alias.service.provider.ICourierService;

public class AmazonOrderManager {

	private AmazonOrder order;
	private ICourierService blueDartCourierServiceImpl;
	private ICourierService dtdcCourierServiceImpl;
	
	public void setOrder(AmazonOrder order) {
		this.order = order;
	}
	
	
	public ICourierService getBlueDartCourierServiceImpl() {
		return blueDartCourierServiceImpl;
	}

	public void setBlueDartCourierServiceImpl(ICourierService blueDartCourierServiceImpl) {
		this.blueDartCourierServiceImpl = blueDartCourierServiceImpl;
	}

	public ICourierService getDtdcCourierServiceImpl() {
		return dtdcCourierServiceImpl;
	}

	public void setDtdcCourierServiceImpl(ICourierService dtdcCourierServiceImpl) {
		this.dtdcCourierServiceImpl = dtdcCourierServiceImpl;
	}

	public AmazonOrder getOrder() {
		return order;
	}


	
	
	public String setAmazonOrder() {
		String status = null;
		if(order.getZipCode() <= 7000 && order.getZipCode()>=6000) {
			status = blueDartCourierServiceImpl.courier(order.getProducts(), order.getAddress());
		}else {
			status = dtdcCourierServiceImpl.courier(order.getProducts(), order.getAddress());
		}
		
		return status;
	}
	
	
	
	
}

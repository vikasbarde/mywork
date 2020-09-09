package com.bean.alias.service.consumer;

import java.util.List;

import com.bean.alias.service.lossly.couple.DtdcCourierService;
import com.bean.alias.service.provider.ICourierService;

public class DtdcCourierServiceImpl implements ICourierService {

	DtdcCourierService dtdcCourierService = new DtdcCourierService();
	
	
	
	
	public void setDtdcCourierService(DtdcCourierService dtdcCourierService) {
		this.dtdcCourierService = dtdcCourierService;
	}


	@Override
	public String courier(List<String> products, String address) {
		return dtdcCourierService.parcel(products, address);
	}

}

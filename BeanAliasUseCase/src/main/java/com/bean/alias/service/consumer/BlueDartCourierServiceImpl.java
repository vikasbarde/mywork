package com.bean.alias.service.consumer;

import java.util.List;

import com.bean.alias.service.lossly.couple.BlueDartService;
import com.bean.alias.service.provider.ICourierService;

public class BlueDartCourierServiceImpl implements ICourierService {

	private BlueDartService blueDartService;

	public void setBlueDartService(BlueDartService blueDartService) {
		this.blueDartService = blueDartService;
	}

	@Override
	public String courier(List<String> products, String address) {
		return blueDartService.courier(products, address);
	}

}

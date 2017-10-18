package com.spring.boot.mini.jsp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.mini.jsp.model.Mobile;

@Service
public class MobileService {

	private List<Mobile> mobiles = new ArrayList<>(Arrays.asList(new Mobile("3T", "OnePlus", "6GB", true),
			new Mobile("Galaxy On 7 Max", "Samsung", "4GB", true), new Mobile("Galaxy J7 Pro", "Samsung", "4GB", true)));

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public Mobile getMobileById(String model) {
		return mobiles.stream().filter(mobile -> mobile.getModel().equals(model)).findFirst().get();
	}
	
	public void addMobile(Mobile mobile){
		mobiles.add(mobile);
	}

}

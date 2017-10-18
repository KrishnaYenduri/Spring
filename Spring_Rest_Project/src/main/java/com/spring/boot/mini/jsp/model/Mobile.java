package com.spring.boot.mini.jsp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mobile {

	@JsonProperty("model")
	private String model;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("intMem")
	private String intMem;

	@JsonProperty("isDualSim")
	private boolean isDualSim;
	
	public Mobile() {
	}

	public Mobile(String model, String brand, String intMem, boolean isDualSim) {
		this.model = model;
		this.brand = brand;
		this.intMem = intMem;
		this.isDualSim = isDualSim;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIntMem() {
		return intMem;
	}

	public void setIntMem(String intMem) {
		this.intMem = intMem;
	}

	public boolean isDualSim() {
		return isDualSim;
	}

	public void setDualSim(boolean isDualSim) {
		this.isDualSim = isDualSim;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", intMem=" + intMem + ", isDualSim=" + isDualSim
				+ "]";
	}
}

package com.first.spring.model;

public class FirstModel {
	private int model;
	private String modelName;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "FirstModel [model=" + model + ", modelName=" + modelName + "]";
	}
	
	
}

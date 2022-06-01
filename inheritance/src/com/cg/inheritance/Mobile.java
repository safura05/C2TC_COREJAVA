package com.cg.inheritance;
public class Mobile {
	private String manufacturer;
	private String operatin0_system;
	protected String model;
	private double cost;
	public Mobile(String manufacturer, String operatin0_system, String model, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.operatin0_system = operatin0_system;
		this.model = model;
		this.cost = cost;
	}
public String getModel()
{return"This is a super class method:"+this.model;
}
@Override
public String toString() {
	return "Mobile [manufacturer=" + manufacturer + ", operatin0_system=" + operatin0_system + ", model=" + model
			+ ", cost=" + cost + "]";
}
}
package com.cg.inheritance;

public class Blackberry extends Mobile{

	public Blackberry(String manufacturer, String operatin0_system, String model, double cost) {
		super(manufacturer, operatin0_system, model, cost);
		// TODO Auto-generated constructor stub
	}
	public String getModel()
	{return"This is a derived class method:"+ model;
	}


}

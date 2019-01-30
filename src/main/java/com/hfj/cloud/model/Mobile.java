package com.hfj.cloud.model;

public class Mobile {

	private long id;
	private String brand;
	private String model;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + "]";
	}

	public Mobile(long id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}

}

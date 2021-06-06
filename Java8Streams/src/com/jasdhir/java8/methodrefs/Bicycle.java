package com.jasdhir.java8.methodrefs;



 class Bicycle {

    private String brand;
    private Integer frameSize;
    
    
	public Bicycle() {
		super();
	}
	public Bicycle(String brand, Integer frameSize) {
		super();
		this.brand = brand;
		this.frameSize = frameSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getFrameSize() {
		return frameSize;
	}
	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;
	}
    
}


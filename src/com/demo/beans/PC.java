package com.demo.beans;

public class PC implements Computer {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String ram,String hdd,String cpu) {
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

}

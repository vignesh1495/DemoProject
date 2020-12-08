package com.demo.abstractFactory;

import com.demo.beans.Computer;
import com.demo.beans.PC;

public class PCFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new PC(this.RAM,this.HDD,this.CPU);
	}
	private String RAM;
	private String HDD;
	private String CPU;
	
	public PCFactory(String ram,String hdd,String cpu) {
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	
	

}

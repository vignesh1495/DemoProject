package com.demo.abstractFactory;

import com.demo.beans.Computer;
import com.demo.beans.PC;
import com.demo.beans.Server;

public class ServerFactory  implements ComputerAbstractFactory,Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	public ServerFactory(String ram,String hdd,String cpu) {
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(this.RAM,this.HDD,this.CPU);
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	 String getHDD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.demo.abstractFactory;

import com.demo.beans.Computer;

public class ComputerFactory {
	
	public void newMethod1() {
		System.out.println("new line to push to git");
	}
	
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}

}

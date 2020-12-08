package com.demo.abstractFactory;

import com.demo.beans.Computer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}

}

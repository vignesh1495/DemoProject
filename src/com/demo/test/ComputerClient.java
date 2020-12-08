package com.demo.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import com.demo.abstractFactory.ComputerFactory;
import com.demo.abstractFactory.PCFactory;
import com.demo.abstractFactory.ServerFactory;
import com.demo.beans.Computer;

public class ComputerClient {
	
	
public String message = "Saurabh";
	
	
	
	
	@Test
	public void testJUnitMessage(){

		 Assert.assertTrue("A " == "B");

	}
	
	
	
	
	
	

	public static void main(String[] args) {
		int ij=1;
		Integer i =ij;
		int j=ij;
		System.out.println(j);
		Integer[] value=new Integer[] {4,5,6,7,8,9};
		Integer[] value1=new Integer[] {4,5,6,7,8,9};
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value.equals(value1));
		
		HashSet set = new HashSet();
		
		set.add(new Integer(566));
		set.add(255);
		
		set.add(null);
		set.add("String");
		System.out.println(set);
	//	Computer pc = ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));	
	//	Computer server = ComputerFactory.createComputer(new ServerFactory("2 GB","500 GB","2.4 GHz"));	

	}
	@Test
	public void test1() {
		String name =new String("vignesh");
		String name2 =new String("vignesh");
		String name3="vignesh";
		String name4="vignesh";
		int[] value = new int[] {1,2,3,4};
		int[] value2 = new int[] {1,2,3};
		assertSame(name,name4);
		//assertArrayEquals(value,value2);
		//assertEquals(name,name4);
	}

}

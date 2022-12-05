package com.learn.testng;

import org.testng.annotations.Test;

public class GroupingExample {
/* Scenario : A big basket is having a different kind of mobiles.
 * let us say there are apple phones,moto,vivo and lenova.
 * i want to run tests only for vivo and moto phones.write a program for that
 */
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("apple Testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("APPLE Testing");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("moto testing");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("MOTO testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("vivo testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("VIVO testing");
	}
	@Test(groups= {"Lenovo"})
	public void lenovo1() {
		System.out.println("lenovo testing");
	}
	@Test(groups= {"Lenovo"})
	public void lenovo2() {
		System.out.println("LENOVO testing");
	}
}

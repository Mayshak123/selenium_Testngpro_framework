package com.example.testNG;

import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test(expectedExceptions = ArithmeticException.class)
	//@Test
	private void DeveloperOne() {
		int i = 20;
		System.out.println(i / 0);
		System.out.println("DEVELOPER ONE");
	}
	@Test
	//@Test(dependsOnMethods = "DeveloperOne")
	private void DeveloperTwo() {
		System.out.println("DEVELOPER TWO");
	}

	@Test(dependsOnMethods = { "DeveloperOne", "DeveloperTwo" })
	private void Testing() {
		System.out.println("TESTING");
	}
}

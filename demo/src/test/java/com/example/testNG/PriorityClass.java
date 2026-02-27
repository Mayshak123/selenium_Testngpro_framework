package com.example.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityClass {
	
	//Priority
	@Test(priority = -2)
	private void login() {
		System.out.println("LOGIN PAGE");
	}

	@Test(priority = 0)
	private void search() {
		System.out.println("SEARCH PAGE");
	}

	@Test(priority = 2)
	private void addtocart() {
		System.out.println("ADD TO CART 1 PAGE");
	}
	
	//Ignore,enabled
	@Ignore
	@Test
	private void login1() {
		System.out.println("LOGIN PAGE");
	}
	
	@Test(enabled = false)
	private void search1() {
		System.out.println("SEARCH PAGE");
	}

	@Test(priority = 2)
	private void addtocart1() {
		System.out.println("ADD TO CART 2 PAGE");
	}
}

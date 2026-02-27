package com.example.testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Annotations {

	@BeforeSuite
	private void propertySetting() {
		System.out.println("open Link");
	}

	@BeforeTest
	private void launchBrowser() {
		System.out.println("Course join");
	}

	@BeforeClass
	private void launchurl() {
		System.out.println("admission open");
	}

	@BeforeMethod
	private void Login() {
		System.out.println("LOGIN");
	}

	@Test
	private void women() {
		System.out.println("Logout");
	}

	@Test
	private void men() {
		System.out.println("Course name");
	}

	@Test
	private void kids() {
		System.out.println("payment");
	}

	@AfterMethod
	private void logout() {
		System.out.println("Timeing");
	}

	@AfterClass
	private void screenshot() {
		System.out.println("Gender name");
	}

	@AfterTest
	private void closeBrowser() {
		System.out.println("Closing time");
	}

	@AfterSuite
	private void browserTermination() { 
		System.out.println("Start time");
	}
}
    


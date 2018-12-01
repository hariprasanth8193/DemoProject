package com.cucumber.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order = 0)
	public void beforeHook() {
		System.out.println("Before Hook 0");
	}

	@Before(order = 1)
	public void beforeHook_1() {
		System.out.println("Before Hook 1");
	}

	@After(order = 1)
	public void afterHook() {
		System.out.println("After Hook 1");
	}

	@After(order = 0)
	public void afterHook_1() {
		System.out.println("After Hook 0");
	}
}

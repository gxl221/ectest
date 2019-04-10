package com.hyan.service;

public class TestClass {

	public static void main(String[] args) {
		ServiceHello test = new ServiceHelloService().getServiceHelloPort();
		String result = test.getValue("gxl");
		System.out.println(result);
	}

}

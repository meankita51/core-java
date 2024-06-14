package com.be.accessmodifiers.demo;

public class Child {
	
	public void childDisplay() {
		System.out.println("Display Child");
		
		Parent parent =new Parent();
		parent.display();
	}

}

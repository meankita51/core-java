package com.be.enumaration.demo;

public class MainEnumaration {
	
	enum UserAccess{
		ACTIVE (1 "Active User"," All Access"),
		INACTIVE (2,"Inactive User", "NO Access at All"),
		SUSPENDED (3,"Suspended User" , "Login Access for Particular");
		
		private int srNo;
		private String description;
		private String access;
		
		public static void main(String[]args) {
			
		
		System.out.println(UserAccess.ACTIVE);
		}
		
	}

}

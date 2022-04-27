package com.wa.helloworld;

public class person {
	//ATTRIBUTES
		private String name;
		private int heightCM;
		private double shoeSize;
		private String jobTitle;
		private int age;
	    
		//Constructor
		public person(String name, int heightCM, int shoeSize, String jobTitle, int age) {
			this.name = name;
			this.heightCM = heightCM;
			this.shoeSize = shoeSize;
			this.jobTitle = jobTitle;
			this.age = age;
		}
			
		//Overloading
		public person(String name, int heightCM) {	
			this.name = name;
			this.heightCM = heightCM;
			
		}
		// Non-Static Method
			public void greet() {
				System.out.println("Hi I'm " + name + " and I'm " + age + " years old.");
			}
			public void info() {
				System.out.println("I'm a " + jobTitle + ", my shoe size is " + shoeSize + " and I am " + heightCM + " cm tall.");
			}
		
		}



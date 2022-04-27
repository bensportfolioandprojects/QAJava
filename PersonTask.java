package com.wa.helloworld;

public class PersonTask {
	
	//ATTRIBUTES
	private String name;
	private int heightCM;
	private double shoeSize;
	private String jobTitle;
	private int age;
    
	//Constructor
	public PersonTask(String name, int heightCM, int shoeSize, String jobTitle, int age) {
		this.name = name;
		this.heightCM = heightCM;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}
		
	//Overloading
	public PersonTask(String name, int heightCM) {	
		this.name = name;
		this.heightCM = heightCM;
		
	// Non-Static Method
		public void greet() {
			System.out.println("Hi I'm " + name + " and I'm " + age + " years old.");
		}
	
	}

}

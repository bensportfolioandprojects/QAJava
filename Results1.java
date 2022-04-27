package com.wa.helloworld;

public class Results1 {
	public static void main(String[] args) {
		//Physics
		int physmark = 79;
		int physper = (physmark * 100)/150;
		//Chemistry
		int chemmark = 147;
		int chemper = (chemmark * 100)/150;
		//Biology
		int biomark  = 134;
		int bioper = (biomark * 100)/150;
		
		int totalmark = physmark + chemmark + biomark;
		int percentage = (totalmark * 100)/450;
		System.out.println(physmark);
		System.out.println(chemmark);
		System.out.println(biomark);
		System.out.println(totalmark);
		System.out.println(percentage);
		
		if(physper < 60) {
			System.out.println("Fail");
		} else if(chemper <60) {
			System.out.println("Fail");
		} else if(bioper <60) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
		}
	}

}

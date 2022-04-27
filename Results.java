package com.wa.helloworld;

public class Results {
	public static void main(String[] args) {
		//Physics
		int physmark = 100;
		//Chemistry
		int chemmark = 112;
		//Biology
		int biomark  = 134;
		
		int totalmark = physmark + chemmark + biomark;
		int percentage = (totalmark * 100)/450;
		System.out.println(physmark, chemmark, biomark);
		System.out.println(chemmark);
		System.out.println(biomark);
		System.out.println(totalmark);
		System.out.println(percentage);
	}

}

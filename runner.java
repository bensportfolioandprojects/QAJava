package com.wa.helloworld;

public class runner {

	public static void main(String[] args) {
		
		person dean = new person("Dean", 190, 9, "Hunter", 32);
		person janice = new person("Janice", 152, 5, "Singer", 19);
		person jack = new person("Jack", 163, 7, "Chef", 26);
		person sam = new person("Sam", 195, 11, "Lawyer", 30);
		
		dean.greet();
		dean.info();
		janice.greet();
		janice.info();
		jack.greet();
		jack.info();
		sam.greet();
		sam.info();
	}
}

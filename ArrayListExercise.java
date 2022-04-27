package com.wa.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
	public static void main(String[] args){
		List<String> marvelMovies = new ArrayList<>();
		
		marvelMovies.add("Iron Man");
		marvelMovies.add("Captain America - The First Avenger");
		marvelMovies.add("Thor");
		marvelMovies.add("Iron Man 2");
		marvelMovies.add("Iron Man 3");
		marvelMovies.add("AntMan");
		marvelMovies.add("Guardians of the Galaxy");
		
		System.out.println(marvelMovies);
		
		for(int i = 0; i < marvelMovies.size(); i++) {
			System.out.println(marvelMovies.get(i));
			
			// got to the fourth dot
		}
	}

}

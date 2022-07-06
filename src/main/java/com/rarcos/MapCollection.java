package com.rarcos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MapCollection {

	private MapCollection() {
	}

	// Map 1 - All characters upper case are returned.
	public static List<String> mapAllUpperCaseJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			newCollection.add(elm.toUpperCase());
		}
		return newCollection;
	}

	public static List<String> mapAllUpperCase(List<String> collection) {
		return collection.stream().map(String::toUpperCase).toList();
	}

	// Map 2 - All length of countries are returned.
	public static List<String> mapLengthJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			newCollection.add(String.valueOf(elm.length()));
		}
		return newCollection;
	}

	public static IntStream mapLength(List<String> collection) {
		return collection.stream().mapToInt(String::length);
	}
}

package com.rarcos;

import java.util.ArrayList;
import java.util.List;

public class FilterCollection {

	private FilterCollection() {
	}

	// Filter 1 - Filter collection so that only elements with less or equal then 5
	// characters are returned.
	public static List<String> filterShorterThant5CharactersJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			if (elm.length() <= 5)
				newCollection.add(elm);
		}
		return newCollection;
	}

	public static List<String> filterShorterThant5Characters(List<String> collection) {
		return collection.stream().filter(e -> e.length() <= 5).toList();
	}

	// Filter 2 - Filter collection start with C character are returned.
	public static List<String> filterWithCharacterCJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			if (elm.toUpperCase().contains("C"))
				newCollection.add(elm);
		}
		return newCollection;
	}

	public static List<String> filterWithCharacterC(List<String> collection) {
		return collection.stream().filter(e -> e.toUpperCase().contains("C")).toList();
	}

	// Filter 3 - Filter collection with distinct characters are returned.
	public static List<String> filterWithDistinctCharactersJava7(List<String> collection) {
		List<String> listDistinctInts = new ArrayList<>(collection.size());
		for (String i : collection) {
			if (!listDistinctInts.contains(i)) {
				listDistinctInts.add(i);
			}
		}
		return listDistinctInts;
	}

	public static List<String> filterWithDistinctCharacters(List<String> collection) {
		return collection.stream().distinct().toList();
	}

	// Filter 4 - Filter collection 3 first elements are returned.
	public static List<String> filter3FirstJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>(collection.size());
		newCollection.add(collection.get(0));
		newCollection.add(collection.get(1));
		newCollection.add(collection.get(2));
		return newCollection;
	}

	public static List<String> filter3First(List<String> collection) {
		return collection.stream().limit(3).toList();
	}

	// Filter 4 - Filter collection all elements minus 3 first elements are
	// returned.
	public static List<String> filterAllMinus3FirstJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>(collection.size());

		for (int i = 3; i < collection.size(); i++) {
			newCollection.add(collection.get(i));
		}

		return newCollection;
	}

	public static List<String> filterAllMinus3First(List<String> collection) {
		return collection.stream().skip(3).toList();
	}
}

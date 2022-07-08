package com.rarcos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class SearchCollection {

	private SearchCollection() {
	}

	// Search 1 - Search it have more 4 characters are returned.
	public static List<String> searchAllMore4CharactersJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			if (elm.length() > 4)
				newCollection.add(elm);
		}
		return newCollection;
	}

	public static boolean searchAllMore4Characters(List<String> collection) {
		return collection.stream().allMatch(e -> e.length() > 4);
	}

	// Search 2 - Search it have one or more condition are returned.
	public static List<String> searchConditionJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			if (elm == "Spain")
				newCollection.add(elm);
		}
		return newCollection;
	}

	public static boolean searchCondition(List<String> collection) {
		return collection.stream().anyMatch(e -> e == "Spain");
	}

	// Search 2 - Search it haven't condition are returned.
	public static List<String> searchNotConditionJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String elm : collection) {
			if (elm == "Spain")
				newCollection.add(elm);
		}
		return newCollection;
	}

	public static boolean searchNotCondition(List<String> collection) {
		return collection.stream().noneMatch(e -> e.length() >= 4);
	}

	// Search 3 - Search any element are returned.
	public static List<String> searchAnyElementJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		Random r = new Random();
		int pos = r.nextInt((collection.size() - 0) + 1) + 0;
		newCollection.add(collection.get(pos));
		return newCollection;
	}

	public static Optional<String> searchAnyElement(List<String> collection) {
		return collection.parallelStream().findAny();
	}

	// Search 4 - Search first element are returned.
	public static List<String> searchFirstElementJava7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		Random r = new Random();
		int pos = r.nextInt((collection.size() - 0) + 1) + 0;
		newCollection.add(collection.get(pos));
		return newCollection;
	}

	public static Optional<String> searchFirstElement(List<String> collection) {
		return collection.parallelStream().findFirst();
	}
}

package com.rarcos;

import static java.util.stream.Collectors.toList;

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

	// Map 3 - All name of person to upper case are returned.
	public static List<String> mapNamePersonUpperCaseJava7(List<Person> collection) {
		List<String> newCollection = new ArrayList<>();
		for (Person elm : collection) {
			newCollection.add(String.valueOf(elm.getName().toUpperCase()));
		}
		return newCollection;
	}

	public static List<String> mapNamePersonUpperCase(List<Person> collection) {
		return collection.stream().map(e -> e.getName()).map(e -> e.toUpperCase()).toList();
	}

	// Map 4 - Flat map are returned.
	public static List<String> mapFlatJava7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> mapFlat(List<List<String>> collection) {
        return collection.stream() // Convert collection to Stream
                .flatMap(value -> value.stream()) // Replace list with stream
                .collect(toList()); // Collect results to a new list
    }
}

package com.rarcos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class DataAndCalculateCollection {

	private DataAndCalculateCollection() {
	}

	// Data and calculate 1 - Max number are returned.
	public static int dataAndCalculateMaxJava7(int[] collection) {
		int maximum = collection[0];
		for (int i = 1; i < collection.length; i++) {
			if (maximum < collection[i])
				maximum = collection[i];
		}
		return maximum;
	}

	public static OptionalInt dataAndCalculateMax(int[] collection) {
		return Arrays.stream(collection).reduce(Integer::max);
	}

	// Data and calculate 2 - Sum of numbers are returned.
	public static int dataAndCalculateSumJava7(int[] collection) {
		int sum = 0;
		for (int number : collection) {
			sum += number;
		}
		return sum;
	}

	public static int dataAndCalculateSum(int[] collection) {
		return Arrays.stream(collection).reduce(0, (x, y) -> x + y);
	}

	// Data and calculate 3 - Elements sorted are returned.
//	public static int[] dataAndCalculateSortJava7(int[] collection) {
//		return Collections.sort(collection);
//	}

	public static Object[] dataAndCalculateSort(List<String> collection) {
		return collection.stream().sorted((s1, s2) -> s1.compareTo(s2)).toArray();
	}

	// Data and calculate 4 - Oldest person are returned.
	public static Person getOldestPerson7(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

	public static Person getOldestPerson(List<Person> people) {
		return people.stream() // Convert collection to Stream
				.max(Comparator.comparing(Person::getAge)) // Compares people ages
				.get(); // Gets stream result
	}
}

package com.rarcos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsCollection {

	private CollectorsCollection() {
	}

	// Collectors 1 - Count of elements are returned.
	public static Long collectorsCountingJava7(List<String> collection) {
		return (long) collection.size();
	}

	public static Long collectorsCounting(List<Integer> collection) {
		return collection.stream().collect(Collectors.counting());
	}

	// Collectors 2 - Max of elements are returned.
//	public static Long collectorsMaxJava7(List<String> collection) {
//		return (long) Collections.max(collection);
//	}

	public static Optional<Integer> collectorsMax(List<Integer> collection) {
		return collection.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
	}

	// Collectors 3 - Sum of elements are returned.
	public static Double collectorsSumJava7(List<Integer> collection) {
		double sum = 0;
		for (int i = 0; i < collection.size(); i++) {
			sum = sum + collection.get(i);
		}
		return sum;
	}

	public static Integer collectorsSum(List<Integer> collection) {
		return collection.stream().collect(Collectors.summingInt(v -> v.intValue()));
	}

	// Collectors 4 - Average of elements are returned.
	public static Double collectorsAverageJava7(List<Integer> collection) {
		double sum = 0;
		for (int i = 0; i < collection.size(); i++) {
			sum = sum + collection.get(i);
		}
		return sum / collection.size();
	}

	public static Double collectorsAverage(List<Integer> collection) {
		return collection.stream().collect(Collectors.averagingInt(Integer::intValue));
	}

	// Collectors 5 - Summarizing of elements are returned.
	public static IntSummaryStatistics collectorsSummarizing(List<Integer> collection) {
		return collection.stream().collect(Collectors.summarizingInt(Integer::intValue));
	}

	// Collectors 6 - Join of elements are returned.
	public static String collectorsJoining(List<Integer> collection) {
		return collection.stream().sorted().map(Object::toString).collect(Collectors.joining(", "));
	}

	// Collectors 7 - Group by of elements are returned.
	public static Map<String, List<Person>> collectorsGroupByNationalityJava7(List<Person> people) {
		Map<String, List<Person>> map = new HashMap<>();
		for (Person person : people) {
			if (!map.containsKey(person.getNationality())) {
				map.put(person.getNationality(), new ArrayList<>());
			}
			map.get(person.getNationality()).add(person);
		}
		return map;
	}

	public static Map<String, List<Person>> collectorsGroupByNationality(List<Person> people) {
		return people.stream() // Convert collection to Stream
				.collect(groupingBy(Person::getNationality)); // Group people by nationality
	}

	// Collectors 8 - Collector to set are returned.
	public static Set<Person> collectorsToSet(List<Person> people) {
		return people.stream().collect(Collectors.toSet());
	}

	// Collectors 9 - Collector to list are returned.
	public static List<Person> collectorsToList(List<Person> people) {
		return people.stream().collect(Collectors.toList());
	}

	// Collectors 10 - Collector to map are returned.
	public static Map<String, Integer> collectorsToMap(List<Person> people) {
		return people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
	}
}

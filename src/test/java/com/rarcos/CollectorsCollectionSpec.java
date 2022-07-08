package com.rarcos;

import org.junit.Test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import static com.rarcos.CollectorsCollection.*;
import static org.assertj.core.api.Assertions.assertThat;
import static java.util.Arrays.asList;


public class CollectorsCollectionSpec {

	@Test
	public void collectorsCountingTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		long expected = 20;
		assertThat(collectorsCounting(collection)).isEqualTo(expected);
	}
	
	@Test
	public void collectorsMaxTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		Optional<Integer> expected = Optional.of(999); //Random value
		assertThat(collectorsMax(collection)).isEqualTo(expected);
	}

	@Test
	public void collectorsSumTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		Integer expected = 469; //Random value
		assertThat(collectorsSum(collection)).isEqualTo(expected);
	}
	
	@Test
	public void collectorsAverageTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		Double expected = 469.2; //Random value
		assertThat(collectorsAverage(collection)).isEqualTo(expected);
	}
	
	@Test
	public void collectorsSummarizingTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		IntSummaryStatistics expected = new IntSummaryStatistics(20, 16, 917, 9140); //Random value
		assertThat(collectorsSummarizing(collection)).isEqualTo(expected);
	}
	
	@Test
	public void collectorsJoiningTest() {
		Random r = new Random();
		List<Integer> collection = r.ints(0, 1000).limit(20).boxed().collect(Collectors.toList());
		String expected = "[32, 65, 131, 202, 255, 263, 314, 347, 449, 472, 502, 533, 561, 587, 816, 852, 861, 910, 913, 989]"; //Random value
		assertThat(collectorsJoining(collection)).isEqualTo(expected);
	}
	
	@Test
	public void collectorsGroupByNationalityTest() {
		Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = collectorsGroupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
	}
	
	@Test
	public void collectorsToSetTest() {
		Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Set<Person> result = Set.of(sara, eva, viktor);
        assertThat(collectorsToSet(collection)).hasSameElementsAs(result);
	}
	
	@Test
	public void collectorsToListTest() {
		Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        List<Person> result = asList(sara, eva, viktor);
        assertThat(collectorsToList(collection)).hasSameElementsAs(result);
	}
	
	@Test
	public void collectorsToMapTest() {
		Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, Integer> result = Map.of("Sara", 4, "Viktor", 40, "Eva", 42);
        assertThat(collectorsToMap(collection)).hasSameSizeAs(result);
	}
}

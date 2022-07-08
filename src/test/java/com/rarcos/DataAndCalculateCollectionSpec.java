package com.rarcos;

import org.junit.Test;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import static com.rarcos.DataAndCalculateCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class DataAndCalculateCollectionSpec {

	@Test
	public void dataAndCalculateMaxTest() {
		int[] rnd = new Random().ints(100, 0, 1000).toArray();
		OptionalInt expected = OptionalInt.of(999); //An random value
		assertThat(dataAndCalculateMax(rnd)).isEqualTo(expected);
	}
	
	@Test
	public void dataAndCalculateSumTest() {
		int[] rnd = new Random().ints(100, 0, 1000).toArray();
		OptionalInt expected = OptionalInt.of(50485); //An random value
		assertThat(dataAndCalculateSum(rnd)).isEqualTo(expected);
	}
	
	@Test
	public void dataAndCalculateSortTest() {
		List<String> collection = asList("Sweden", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Austria");
		List<String> expected = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		assertThat(dataAndCalculateSort(collection)).hasSameElementsAs(expected);
	}

	@Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }
}

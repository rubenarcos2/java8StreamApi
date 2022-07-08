package com.rarcos;

import org.junit.Test;

import java.util.List;

import static com.rarcos.MapCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class MapCollectionSpec {

	@Test
	public void mapAllUpperCaseTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("AUSTRIA", "BELGIUM", "BULGARIA", "CROATIA", "CYPRUS", "CZECH", "DENMARK",
				"ESTONIA", "FINLAND", "FRANCE", "GERMANY", "GREECE", "HUNGARY", "IRELAND", "ITALY", "LATVIA",
				"LITHUANIA", "LUXEMBOURG", "MALTA", "NETHERLANDS", "POLAND", "PORTUGAL", "ROMANIA", "SLOVAKIA",
				"SLOVENIA", "SPAIN", "SWEDEN");
		assertThat(mapAllUpperCase(collection)).hasSameElementsAs(expected);
	}

	@Test
	public void mapLengthTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<Integer> expected = asList(7, 7, 8, 7, 6, 5, 7, 7, 7, 6, 7, 6, 7, 7, 5, 6, 9, 10, 5, 11, 6, 8, 7, 8, 8, 5,
				6);
		assertThat(mapLength(collection)).hasSameElementsAs(expected);
	}

	@Test
	public void mapNamePersonUpperCaseTest() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		List<Person> collection = asList(sara, eva, viktor);
		List<String> expect = asList("SARA", "EVA", "VIKTOR");
		assertThat(mapNamePersonUpperCase(collection)).hasSameElementsAs(expect);
	}

	@Test
	public void mapFlatCollection() {
		List<List<String>> collection = asList(
				asList("Belgium", "Germany", "Ireland", "Spain", "France", "Italy", "Luxembourg", "Netherlands",
						"Austria", "Portugal", "Finland", "Greece", "Slovenia", "Cyprus", "Malta", "Slovakia",
						"Estonia", "Latvia", "Lithuania"),
				asList("Bulgaria", "Croatia", "Czech", "Denmark", "Hungary", "Poland", "Romania", "Sweden"));
		List<String> expected = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		assertThat(mapFlat(collection)).hasSameElementsAs(expected);
	}
}

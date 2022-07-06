package com.rarcos;

import org.junit.Test;

import java.util.List;

import static com.rarcos.FilterCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionSpec {

	@Test
	public void transformShorterThant5CharactersTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("Czech", "Italy", "Malta", "Spain");
		assertThat(filterShorterThant5Characters(collection)).hasSameElementsAs(expected);
	}

	@Test
	public void filterWithCharacterCTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("Croatia", "Cyprus", "Czech", "France", "Greece");
		assertThat(filterWithCharacterC(collection)).hasSameElementsAs(expected);
	}

	@Test
	public void filterWithDistinctsCharactersTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		assertThat(filterWithDistinctCharacters(collection)).hasSameElementsAs(expected);
	}
	
	@Test
	public void filter3FirstTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("Austria", "Belgium", "Bulgaria");
		assertThat(filter3First(collection)).hasSameElementsAs(expected);
	}
	
	@Test
	public void filterAllMinus3FirstTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		List<String> expected = asList("Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		assertThat(filterAllMinus3First(collection)).hasSameElementsAs(expected);
	}
}

package com.rarcos;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import static com.rarcos.SearchCollection.searchAllMore4Characters;
import static com.rarcos.SearchCollection.searchAnyElement;
import static com.rarcos.SearchCollection.searchCondition;
import static com.rarcos.SearchCollection.searchFirstElement;
import static com.rarcos.SearchCollection.searchNotCondition;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchCollectionSpec {

	@Test
	public void searchAllMore4CharactersTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		boolean expected = true;
		assertThat(searchAllMore4Characters(collection)).isEqualTo(expected);
	}

	@Test
	public void searchConditionTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		boolean expected = true;
		assertThat(searchCondition(collection)).isEqualTo(expected);
	}
	
	@Test
	public void searchNotConditionTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		boolean expected = false;
		assertThat(searchNotCondition(collection)).isEqualTo(expected);
	}
	
	@Test
	public void searchAnyElementTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		Optional<String> expected = Optional.ofNullable("Luxembourg");
		assertThat(searchAnyElement(collection)).isEqualTo(expected);
	}
	
	@Test
	public void searchFirstElementTest() {
		List<String> collection = asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech", "Denmark",
				"Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
				"Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia",
				"Slovenia", "Spain", "Sweden");
		Optional<String> expected = Optional.ofNullable("Austria");
		assertThat(searchFirstElement(collection)).isEqualTo(expected);
	}
}

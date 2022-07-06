package com.rarcos;

import org.junit.Test;

import java.util.List;

import static com.rarcos.FilterCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionSpec {

    @Test
    public void transformKeepStringsShorterThant4Characters() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}

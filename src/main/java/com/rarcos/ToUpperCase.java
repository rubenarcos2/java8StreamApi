//Convert elements of a collection to upper case.

package com.rarcos;

import java.util.ArrayList;
import java.util.List;

public class ToUpperCase {

    private ToUpperCase() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for(String e:collection) {
        	newCollection.add(e.toUpperCase());
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream()
        		.map(e -> e.toUpperCase())
        		.toList();
    }

}

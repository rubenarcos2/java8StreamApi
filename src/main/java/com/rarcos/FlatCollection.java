//Flatten multidimensional collection

package com.rarcos;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatCollection {

    private FlatCollection() {
    }

    public static List<String> transform7(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        List<String> list1 = collection.get(0);
        List<String> list2 = collection.get(1);
        
        newCollection.addAll(list1);
        newCollection.addAll(list2);
        return newCollection;
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
        		.flatMap(e -> e.stream())
        		.collect(toList());
    }

}

//Filter collection so that only elements with less then 4 characters are returned.

package com.rarcos;

import java.util.ArrayList;
import java.util.List;

public class FilterCollection {

    private FilterCollection() {
    }

    public static List<String> transform7(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for(String elm : collection) {
        	if(elm.length() < 4)
        		newCollection.add(elm);
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream()
        		.filter(e-> e.length() < 4)
        		.toList();
    }

}

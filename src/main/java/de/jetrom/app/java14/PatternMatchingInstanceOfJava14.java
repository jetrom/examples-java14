package de.jetrom.app.java14;

import java.util.Collection;

public class PatternMatchingInstanceOfJava14 {

    public boolean isNullOrEmptyStringOrEmptyCollection(Object o) {
        return o == null ||
                o instanceof String && ((String) o).isBlank() ||
                o instanceof Collection && ((Collection) o).isEmpty();

    }

    public boolean isNullOrEmptyStringOrEmptyCollectionJava14Version(Object o) {
        return o == null ||
                o instanceof String s && s.isBlank() ||
                o instanceof Collection c && c.isEmpty();

    }
}

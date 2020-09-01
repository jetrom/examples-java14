package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingInstanceOfJava14Test {


    @Test
    void checkNullObject() {
        Object nullObject = null;
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(nullObject));
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(nullObject));
    }
    @Test
    void checkNotNullObject() {
        var nonNullObject = new Object();
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(nonNullObject));
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(nonNullObject));
    }
    @Test
    void checkEmptyString() {
        var stringEmpty = "";
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(stringEmpty));
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(stringEmpty));
    }

    @Test
    void checkNonEmptyString() {
        var stringNonEmpty = "Non Empty String";
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(stringNonEmpty));
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(stringNonEmpty));
    }
    @Test
    void checkEmptyCollection() {
        var emptyCollection = Collections.EMPTY_LIST;
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(emptyCollection));
        assertTrue(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(emptyCollection));
    }

    @Test
    void checkNonEmptyCollection() {
        var nonEmptyCollection = Arrays.asList("1");
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollection(nonEmptyCollection));
        assertFalse(new PatternMatchingInstanceOfJava14().isNullOrEmptyStringOrEmptyCollectionJava14Version(nonEmptyCollection));
    }
}
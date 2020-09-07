package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTypePersonJava14Test {

    @Test
    public void testOverrideMethodsOfRecordType() {
        var personRecordType = new RecordTypePersonJava14("id123", "Mustermann");
        System.out.println("RecordTypePersonJava14.toString(): " + personRecordType);
        assertNotNull(personRecordType.toString());
        System.out.println("RecordTypePersonJava14.hashCode(): " + personRecordType.hashCode());
        assertNotNull(personRecordType.hashCode());

        var personRecordType2 = new RecordTypePersonJava14("id123", "Mustermann");
        assertEquals(personRecordType2, personRecordType);

    }

    @Test
    public void testGetterMethodsOfVariablesOfRecordType() {
        var personRecordType = new RecordTypePersonJava14("id123", "Mustermann");
        System.out.println("RecordTypePersonJava14.id(): " + personRecordType.id());
        assertNotNull(personRecordType.id());
        System.out.println("RecordTypePersonJava14.name(): " + personRecordType.hashCode());
        assertNotNull(personRecordType.name());

    }
}
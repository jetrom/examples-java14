package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTypePersonImplementsInterfaceTest {

    @Test
    public void getIdWithName() {
        var person = new RecordTypePersonImplementsInterface("id", "name");
        assertNotNull(person.getIdWithName());
    }

}
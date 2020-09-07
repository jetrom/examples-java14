package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTypePersonWitValidationTest {

    @Test
    public void validateConstructorParametersOk() {
        var person = new RecordTypePersonWitValidation("id", "name");
        assertNotNull(person);
    }

    @Test
    public  void validateConstructorParametersWitException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new RecordTypePersonWitValidation(null, "name");
        });
    }
}
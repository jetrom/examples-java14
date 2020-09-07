package de.jetrom.app.java14;

/**
 * Record type with validation of the constructor parameters
 */
public record RecordTypePersonWitValidation(String id, String name) {

    // here compact validation of constructor parameters
    public RecordTypePersonWitValidation {
        if (id == null || name == null) {
            throw new IllegalArgumentException("Constructor parameters must be not null! " + id + " : " + name);
        }
    }
}

package de.jetrom.app.java14;

/**
 * Record type with implementation of interface
 */
public record RecordTypePersonImplementsInterface(String id, String name) implements Person {

    @Override
    public String getIdWithName() {
        return id() + " : " + name();
    }
}

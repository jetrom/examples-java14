package de.jetrom.app.java14;

/**
 * Example for the new record type: compact data container classes <br/>
 * Usage: <br/>
 * <ul>
 * <li>compound keys for maps</li>
 * <li>data transfer objects</li>
 * <li>parameter value objects</li>
 * </ul>
 * record types implicit final
 * person as record type
 */
record RecordTypePersonJava14(String id, String name) {}

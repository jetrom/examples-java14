package de.jetrom.app.java14;

import java.util.Objects;

/**
 * example normal java class of a person not Java 14 style
 */
public final class ClassTypePersonNotJava14 {
    private final String id;
    private final String name;

    public ClassTypePersonNotJava14(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassTypePersonNotJava14 that = (ClassTypePersonNotJava14) o;
        return id.equals(that.id) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "ClassTypePersonNotJava14{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

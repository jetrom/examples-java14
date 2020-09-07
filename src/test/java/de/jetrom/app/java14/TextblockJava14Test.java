package de.jetrom.app.java14;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TextblockJava14Test {

    public static final String TEXT_BLOCK_SEVERAL_LINES_BEFORE_JAVA_14 = "line1 Textblock with several lines with concatenation,\n" +
            "line2,\n" +
            "line3,\n" +
            "line4,\n";
    public static final String TEXT_BLOCK_SEVERAL_LINES_JAVA_14_STYLE = """
            line1 Textblock with several lines without concatenation,
            line2,
            line3,
            line4,
            """;
    public static final String JSON_JAVA_14_STYLE = """
            {
                "id"   : "id123",
                "name" : "Max Mustermann"
            }
            """;

    public static final String XML_JAVA_14_STYLE = """
            <person>
                <id>id123</id>
                <name>Max Mustermann</name>
            </person>
            """;


    public static final String TEXT_BLOCK_SEVERAL_LINES_BEFORE_JAVA_14_COMPARE = "line1,\n" +
            "line2,\n" +
            "line3,\n" +
            "line4,\n";

    public static final String TEXT_BLOCK_SEVERAL_LINES_JAVA_14_STYLE_COMPARE = """
            line1,
            line2,
            line3,
            line4,
            """;


    @Test
    @Order(1)
    void printStringBeforeJava14() {

       TextblockJava14.printString(TEXT_BLOCK_SEVERAL_LINES_BEFORE_JAVA_14);

    }
    @Test
    @Order(2)
    void printStringJava14Style() {
        TextblockJava14.printString(TEXT_BLOCK_SEVERAL_LINES_JAVA_14_STYLE);

    }

    @Test
    @Order(5)
    void compareStrings() {
        assertTrue(TextblockJava14.compareStrings(TEXT_BLOCK_SEVERAL_LINES_BEFORE_JAVA_14_COMPARE, TEXT_BLOCK_SEVERAL_LINES_JAVA_14_STYLE_COMPARE));
    }

    @Test
    @Order(3)
    void printJSONJava14Style() {

        TextblockJava14.printString(JSON_JAVA_14_STYLE);

    }
    @Test
    @Order(4)
    void printXMLJava14Style() {

        TextblockJava14.printString(XML_JAVA_14_STYLE);

    }

}
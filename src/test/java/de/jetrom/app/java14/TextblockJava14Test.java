package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

class TextblockJava14Test {

    @Test
    void printStringBeforeJava14() {
        String helloBlockSeveralLinesBeforeJava14 =
        "line1 Textblock with several lines with concatenation,\n" +
        "line2,\n" +
        "line3,\n" +
        "line4,\n"
        ;
        
       TextblockJava14.printString(helloBlockSeveralLinesBeforeJava14);

    }
    @Test
    void printStringJava14Style() {
        String helloBlockSeveralLinesJava14Style = """
        line1 Textblock with several lines without concatenation,
        line2,
        line3,
        line4,
        """;
        
       TextblockJava14.printString(helloBlockSeveralLinesJava14Style);

    }

    @Test
    void compareStrings() {
    }
}
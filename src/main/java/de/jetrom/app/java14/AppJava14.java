package de.jetrom.app.java14;

/**
 * Hello world!
 *
 */
public class AppJava14
{
    public static void main( String[] args ) {

        printHelloWorldAndJavaVersion();

    }

    private static void printHelloWorldAndJavaVersion() {
        System.out.print( "Hello World for Java: " );
        System.out.println(System.getProperty("java.version"));
    }
}

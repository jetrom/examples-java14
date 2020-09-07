package de.jetrom.app.java14;

/**
 * TextblockJava14Style text block in triple quotes:<br/>
 * """
 * text block
 * """
 *
 */
public class TextblockJava14 {

   public static void printString(String inputString) {

       System.out.println("Input: ");
       System.out.println(inputString);
   }

   public static boolean compareStrings(String inputBeforeJava14, String inputJava14Style) {
       System.out.println("inputBeforeJava14: " +  inputBeforeJava14);
       System.out.println("inputJava14Style: " +  inputJava14Style);
       if (inputBeforeJava14 != null && inputJava14Style != null) {
        return inputBeforeJava14.equals(inputJava14Style);
       } else {
           throw new IllegalArgumentException("Input-Parameter are null: " + inputBeforeJava14 + " " + inputJava14Style);
       }

   }
}

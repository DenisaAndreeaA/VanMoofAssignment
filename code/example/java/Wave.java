package code.example.java;

import java.util.ArrayList;

public class Wave {
    public static void main(String[] args){
        ArrayList<String> wave = new ArrayList<>();

        // Read first argument as the input string
        String str = "";
        if (args.length == 0) {
            System.out.println("No input string provided.");
        } else {
            str = args[0];
        }

        // Use StringBuilder to reduce complexity from lowercase string
        StringBuilder strBuilder = new StringBuilder(str.toLowerCase());

        // Loop through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            // Find character at index i
            char c = str.charAt(i);
            // Check if character is letter
            if (Character.isLetter(c)) {
                // Set character at index i (current) to uppercase
                strBuilder.setCharAt(i, Character.toUpperCase(c));
                // Add the resulted string builder to result array
                wave.add(strBuilder.toString());
                // Revert the change of the current character back to lowercase
                strBuilder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        System.out.println(wave);
    }
}

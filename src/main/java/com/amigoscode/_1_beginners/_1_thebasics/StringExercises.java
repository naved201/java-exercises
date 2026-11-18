package com.amigoscode._1_beginners._1_thebasics;

import java.util.Locale;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // TODO: 1 - Get the length of the 'message' string and print it
        System.out.println("Length of the message text: " + message.length() + "\n");


        // TODO: 2 - Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        System.out.println("The message text in upper case: " + message.toUpperCase());
        System.out.println("The message text in lower case: " + message.toLowerCase() + "\n");


        // TODO: 3 - Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        System.out.println("The first 5 characters of the message text are: " + message.substring(0, 5));

        // TODO: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        System.out.println("Does the message text contain 'Amigoscode?' " + message.contains("Amigoscode") + "\n");

        // TODO: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        String replacedMessage = message.replace("Amigoscode", "Java");
        System.out.println(replacedMessage + "\n");

        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        System.out.println("Trimmed padding from the padded string:\n" + padded.trim() + "\n");

        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        String[] csvArray = csv.split(",");
        for (int i = 0; i < csvArray.length; i++){
            System.out.println("CSV Array element " + i + ": " + csvArray[i] + "\n");
        }

        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.

        /*
        * == Wouldn't work for string comparisons because strings in java are reference type objects.
        * String objects contain references to memory locations. So the == operator would compare the memory
        * addresses instead of the string values.
        * */
        String str1 = "yoyo!";
        String str2 = "yoyo!";
        System.out.println("Are str1 and str2 the same? " + str1.equals(str2));
    }
}

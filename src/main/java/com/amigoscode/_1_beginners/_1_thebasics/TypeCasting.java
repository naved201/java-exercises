package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int num = 10;
        double num2 = num;
        System.out.println("int num: " + num);
        System.out.println("double num: " + num2 + "\n");


        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double someDouble = 3.14;
        int someInt = (int) someDouble;
        System.out.println("Double someDouble: " + someDouble);
        System.out.println("Int someInt: " + someInt + "\n"); // New line character to space out output blocks.

        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int val = 65;
        char letter = (char) val;
        System.out.println("Result char: " + letter + "\n");

        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char var = 'A';
        int value = (int) var;
        System.out.println("ASCII Code of 'A': " + value + "\n");

        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String numString = "42";
        int intToNum = Integer.parseInt(numString);
        System.out.println("String converted to int: " + numString + "\n");

        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int stringNum = 42;
        String stringToNum = String.valueOf(stringNum + "\n");
    }
}

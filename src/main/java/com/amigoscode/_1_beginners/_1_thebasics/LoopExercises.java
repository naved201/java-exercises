package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Loops
 *
 * Learn how to use for, while, and do-while loops to repeat code.
 * Loops are fundamental for iterating over data and performing repetitive tasks.
 */
public class LoopExercises {

    public static void main(String[] args) {

        // TODO: 1 - Write a for loop to print numbers 1 to 10
        // Hint: for (int i = 1; i <= 10; i++) { ... }
        for (int i = 10; i <= 10; i++){
            System.out.println(i);
        }


        // TODO: 2 - Write a while loop to print numbers 10 down to 1 (countdown)
        // Hint: Declare a variable before the loop, use a condition, and decrement inside the loop.
        int i = 10;
        while (i >= 1){
            System.out.println(i);
            i--;
        }


        // TODO: 3 - Write a do-while loop that runs at least once
        // Print "This runs at least once!" inside the loop.
        // Use a condition that is false so the loop only runs once.
        // Hint: do { ... } while (condition);
        int num = 1;
        do{
            System.out.println("YAY!");
            num++;
        } while (num > 3);


        // TODO: 4 - Write a for loop to print only even numbers from 1 to 20
        // Hint: Use an if statement with the modulus operator (%) inside the loop,
        //       or increment by 2 starting from 2.
        for (int n = 0; n <= 20;){
            n += 2;
            System.out.println(n);
        }


        // TODO: 5 - Write a for loop to calculate the factorial of 5 (5! = 120)
        // Declare a variable called factorial and initialize it to 1.
        // Multiply factorial by each number from 1 to 5.
        // Print the result.
        int factorial = 1;
        for (int j = 5; j >= 1 ; j--){
            factorial *= j;
        }
        System.out.println("5! = " + factorial + "\n");


        // TODO: 6 - Use an enhanced for loop (for-each) to iterate over a String array
        // Declare a String array called fruits with at least 4 fruit names.
        // Use an enhanced for loop to print each fruit.
        String[] fruits = {"banana", "apple", "orange", "strawberry"};
        for (String fruit: fruits){
            System.out.println(fruit);
        }


        // TODO: 7 - Write a nested for loop to print a 3x3 multiplication table
        // The output should look like:
        //   1  2  3
        //   2  4  6
        //   3  6  9
        // Hint: Use System.out.print() for values on the same row,
        //       and System.out.println() to move to the next row.
        for (int row = 1; row <= 3; row++){
            for (int col = 1; col <= 3; col++){
                if (col > 1) {
                    System.out.print(" ");
                }
                System.out.print(row * col);
            }
            System.out.println();
        }


        // TODO: 8 - Use break and continue in a loop
        // Write a for loop from 1 to 10:
        //   - Use 'continue' to skip the number 5 (do not print it)
        //   - Use 'break' to stop the loop when you reach 8
        // Print each number that is not skipped.
        for (int v = 1; v <= 10; v++){
            if (v == 8){
                break;
            }
            else if (v == 5){
                continue;
            }
            else{
                System.out.println(v);
            }
        }
    }
}

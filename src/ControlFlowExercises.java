import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("Control Flow Exercises");

        /*Create an integer variable i with a value of 5. Create a while loop that runs so long as i is less than or
        equal to 15. Each loop iteration, output the current value of i, then increment i by one. Your output should
        look like this: 5 6 7 8 9 10 11 12 13 14 15*/

        //while loop
        int i = 5;

        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }

        //do while loop
        /*Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a
        new line.*/

        int counter = 0;

        do{
            System.out.println(counter);
            counter += 2;
            //counter = counter + 2;
        }while(counter <= 100);

        //alter your loop to count backwards by 5's from 100 to -10

        int altCounter = 100;

        do{
            System.out.println(altCounter);
            altCounter -= 5;
            //altCounter = altCounter + 2;
        }while(altCounter >= -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is
        // less than 1,000,000. Output should equal:
        /*2
        * 4
        * 16
        * 256
        * 65536*/

        long differentCounter = 2L;

        do {
            System.out.println(differentCounter);
            differentCounter *= differentCounter;
            //differentCounter= differentCounter * differentCounter;
        }while(differentCounter < 1000000L);

//        for loop
//        refactor the previous two exercises to use a for loop instead

//        int forCounter = 100;
//
//        do {
//            System.out.println(forCounter);
//            forCounter -= 5;
//        }while(forCounter >= -10);
        for(int forCounter = 100; forCounter >= -10; forCounter -= 5){
            System.out.println("forCounter= " + forCounter);
        }

//        long differentCounter = 2L;
//
//        do {
//            System.out.println(differentCounter);
//            differentCounter *= differentCounter;
//            //differentCounter= differentCounter * differentCounter;
//        }while(differentCounter < 1000000L);
        for(long forLongCounter = 2L; forLongCounter < 1000000L; forLongCounter *= forLongCounter){
            System.out.println("forLongCounter= " + forLongCounter);
        }

//        FizzBuzz
//        Write a program that prints the numbers from 1 to 100. For multiples of three print "Fizz" instead of the number. For the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

        for(int n = 1; n <= 100; n++){
            if(n % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(n % 3 == 0){
                System.out.println("Fizz");
            }else if(n % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(n);
            }
        }

//        Prompt the user to enter an integer. Display a table of squares and cubes from 1 to the value entered. Ask
//        if the user wants to continue. Assume that the user will enter valid data. Only continue if the user agrees
//        to.

//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
        //Table of powers
        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;

        do{
            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int input = 1; input <= userInt; input++){
                System.out.format("%-6d", input);
                System.out.print(" | ");
                System.out.format("%-7d", input * input);
                System.out.print(" | ");
                System.out.print(input * input * input);
                System.out.println();
            }
            System.out.print("Would you like to enter another number (y/n)?");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }
        }while(userContinues);
    }
}

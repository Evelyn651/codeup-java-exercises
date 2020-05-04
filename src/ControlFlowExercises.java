import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){
        System.out.println("Control Flow Exercises");
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + "");
//            i++;
//        }

        //do while loop
//        int counter = 0;
//        do{
//            System.out.println(counter);
//            counter += 2;
//        }while(counter <= 100);

        //alter the loop to count backwards by 5's to -10
//        int counter = 100;
//        do{
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter >= -10);

        //loop that starts at 2 and squares each number while number is less than 1,000,000
        //because an int can only hold up to 2,147,483,647, we need to change the storage container of our number, we
        // need to use a long here.
//        long counter = 2;
//        do{
//            System.out.println(counter);
//            counter *= counter;
//        }while(counter < 1000000L);

        //REFACTOR INTO FOR LOOPS

//        for (int counter = 100; counter >= -10; counter -= 5){
//            System.out.println("counter = " + counter);
//        }

//        for (long counter = 2; counter < 1000000L; counter*= counter){
//            System.out.println("counter = " + counter);
//        }

        // FizzBuzz
        for(int number = 1; number <= 100; number++){
            System.out.println(number);
            if(number % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(number % 3 == 0){
                System.out.println("Fizz");
            }else if(number % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(number);
            }
        }
        //Table of powers
        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;

        do{
            System.out.println("What number do you want to go up to?");

            int userNumber = scanner.nextInt();
            System.out.println();
            System.out.println("Here is your table");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("----- | ----- | -----");
            for (int i = 1; i <= userNumber; i++){
                System.out.format("%-6d", i);
                System.out.print(" | ");
                System.out.format("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.print("Do you want to enter another number? (y/n)");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }
        }while(userContinues);


    }
}

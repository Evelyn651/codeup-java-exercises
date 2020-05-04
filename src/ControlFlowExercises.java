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
        }



    }
}

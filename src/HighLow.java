import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        highLow(scanner);
    }

    public static void highLow(Scanner scanner){
        int range = 100 - 1 + 1;
        int numberToGuess = ((int)(Math.random() * range) + 1);

        while(true){
            System.out.println("Guess a number between 1 and 100: ");
            int userInput = Integer.parseInt(scanner.nextLine());
            if(userInput > numberToGuess){
                System.out.println("Lower");
            }else if(userInput < numberToGuess){
                System.out.println("Higher");
            }else{
                System.out.println("Good guess");
                break;
            }
        }
    }
}

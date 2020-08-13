package CodecademyJavaPractice.Loops;
import java.util.Random;

public class LuckyFive {
    public static void main(String[] args) {

        //A random number generator
        Random randomGenerator = new Random();

        //generates a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        //repeat while role isn't 5
        while (dieRoll != 5) {
            System.out.println(dieRoll);

            //resets die once it "lands" on 5
            dieRoll = randomGenerator.nextInt(6) + 1;
        }
    }
}

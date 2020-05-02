import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        double pi = 3.14159;

        System.out.println("The value of pi is approximately" + pi);
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter three words: ");
//        String userInput = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println(userInput);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

        System.out.println("Enter a width: ");
        float userWidth = Float.parseFloat(scanner.nextLine());
        System.out.println(userWidth);
        System.out.println("Enter a length: ");
        float userLength = Float.parseFloat(scanner.nextLine());
        System.out.printf("Your width and length: %s %s \n", userWidth, userLength);

        float perimeter = (userWidth * 2) + (userLength * 2);
        float area = userLength * userWidth;

        System.out.println("The perimeter is: "+ perimeter);
        System.out.println("The area is: "+ area);






    }
}

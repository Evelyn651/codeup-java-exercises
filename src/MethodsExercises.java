import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(5,3));
        System.out.println(subtraction(6, 2));
//        System.out.println(multiplication(4, 3));
//        System.out.println(product(4,2));
        System.out.println(division(9, 3));
//        System.out.println(getInteger(3,8));
    }

//    =============================================================
//Exercise 1
    //addition
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    //subtraction
    public static int subtraction(int num3, int num4){
        return num3 - num4;
    }
    //multiplication
//    public static int multiplication(int num5, int num6){
//        return num5 * num6;
//    }
    //MULTIPLICATION WITH RECURSION NOT *
//    public static int product(int num5, int num6){
//        if ((num5 == 0) || (num6 == 0))
//            return 0;
//        else
//            return (num5 + product(num5, num6 - 1));
    //division
    public static int division(int num7, int num8){
        return num7 % num8;
    }
//    ============================================================
    //Exercise 2
//    public static int getInteger(int min, int max){
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = getInteger(1, 10);
//        return userInput;
//    }

//    =============================================================
    //Exercise 3
    public static int factorial(int num){
        System.out.println("Enter a number from 1 to 10: ");
        System.out.println("");
    }

}

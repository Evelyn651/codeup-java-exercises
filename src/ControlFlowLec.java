import java.util.Scanner;

public class ControlFlowLec {
   public static void main (String[] args){
        System.out.println("Control Flow Lecture");
//
////        boolean isTrue = true;
////        System.out.println("isTrue = " + isTrue);
//
//        //Relational operators
        int age = 38;
//
//        // equality ==
//        boolean isTwentyOne = age == 21;
//        System.out.println("isTwentyOne = " + isTwentyOne);
//
//        //inequality !=
//        boolean isNotTwentyOne = age != 21;
//        System.out.println("isNotTwentyOne = " + isNotTwentyOne);
//
//        //less than <
//        boolean isLessThanTwentyOne = age < 21;
//        System.out.println("isLessThanTwentyOne = " + isLessThanTwentyOne);
//
//        //more than >
//        boolean isMoreThanTwentyOne = age > 21;
//        System.out.println("isMoreThanTwentyOne = " + isMoreThanTwentyOne);
//
//       //greater than or equal  >=
//        float orderTotal = 30.00F;
//       boolean applyFreeShipping = orderTotal >= 30;
//        System.out.println("applyFreeShipping = " + applyFreeShipping);
//
//        //greater than or equal  >=
//        float orderTotal = 14.99F;
//        boolean applySmallOrderSurcharge = orderTotal <= 15.00F;
//        System.out.println("applySmallOrderSurcharge = " + applySmallOrderSurcharge);

        // logical operators
       //&& AND
//       boolean isLoggedIn = true;
//       boolean isAdmin = true;
//       boolean showTheAdminPanel = isLoggedIn && isAdmin && age > 21;
//       System.out.println("showTheAdminPanel = " + showTheAdminPanel);

       //|| or
//       boolean isAdmin = false;
//       boolean isAuthor = true;
//       boolean canEditArticle = isAdmin || isAuthor;
//       System.out.println("canEditArticle = " + canEditArticle);

       // ! not
//       boolean isLoggedIn = false;
//       boolean shouldShowLogin = !isLoggedIn;
//       System.out.println("shouldShowLogin = " + shouldShowLogin);

       Scanner sc = new Scanner(System.in);
       System.out.println("Continue? [y/n]");
       String userInput = sc.next();

//       boolean confirmation = userInput == "y"; //never do this
//       System.out.println("confirmation = " + confirmation);

       boolean confirmation = userInput.equals("y");
       System.out.println("confirmation = " + confirmation);

       //every object in java has an equals function. it supposed to compare the value of what you passed into the
       // object. what we typed to the literal object. doing a value comparison on an object. equals is comparing the
       // value of itself to the value of the string literal "y". a string is an array of characters put together.

       //control structures
       //if

       int weeksInClass = 0;
       if(weeksInClass >= 10){
           System.out.println("We are more than half way done now!");
       }else if(weeksInClass != 0){
           System.out.printf("We are %s weeks in class. \n", weeksInClass);
       }else{
           System.out.println("We have not started class yet.");
       }
   }
}

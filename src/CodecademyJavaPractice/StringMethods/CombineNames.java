package CodecademyJavaPractice.StringMethods;

public class CombineNames {
    public static void main(String[] args){
        //combining first name and last name
        String firstName = "Evelyn";
        String lastName = "Acosta";

        System.out.println(firstName.concat(" " + lastName));

        //combining the alphabet
        String letters = "abcdefg";
        String moreLetters = "hijklmnop";
        String evenMoreLetters = "qrstuvwxyz";

        System.out.println("The alphabet: " + letters.concat(moreLetters + evenMoreLetters));


    }
}

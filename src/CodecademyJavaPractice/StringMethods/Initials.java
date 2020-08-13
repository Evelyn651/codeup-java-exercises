package CodecademyJavaPractice.StringMethods;

public class Initials {
    public static void main(String[] args){
        String firstName = "Bilbo";
        String lastName = "Baggins";

        //get initials
        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));

        String lotr = "The Lord of the Rings";

        System.out.println(lotr.charAt(8)); //spaces are counted in indexes so 3, 8, 11, 15 print nothing
    }
}

package CodecademyJavaPractice.StringMethods;

import jdk.swing.interop.SwingInterOpUtils;

public class MorseCode {
    public static void main(String[] args){
        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - " +
                "/ .-. .- -- . -.";
        // look for . .- - morse code for eat
        System.out.println(code.indexOf(". .- -")); //prints out 87 because that is where . is

        String letters = "ABCDEFGHIMNOPQRSTUVWXYZ";
        System.out.println(letters.indexOf("EFG")); //prints out 4 because thats where e starts
        System.out.println(letters.indexOf("JKL")); //prints out -1 because there is no jkl in the letters string
    }
}

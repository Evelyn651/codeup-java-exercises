import java.util.Scanner;

public class ConsoleIOLec {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        String greeting = "Salutations";
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        //.next() will only take the first part of the typed input. .nextLine() takes the whole line written
        System.out.printf("%s, %s Welcome to my java app!", greeting, name);
        // not println()-- wont work
    }
}

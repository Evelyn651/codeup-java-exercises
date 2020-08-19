package CodecademyJavaPractice.Bugs;

public class Debug {
    public static void main(String[] args){

        //syntax error
        System.out.println("       1");
        System.out.println("     2 3");
        System.out.println("   4 5 6");
        System.out.println("7 8 9 10");
        // last sout was missing ;

        //run-time error
        int width = 20;
        int length = 40;

        int ratio = length / width;
        System.out.println(ratio);
        //missing 2 in 20



    }
}

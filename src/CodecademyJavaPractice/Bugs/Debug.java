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

        //exception handling
        try {
            int ratio = length / width;
            System.out.println(ratio);
        }catch(ArithmeticException e){
            System.err.println("ArithmeticException: " + e.getMessage());
        }
        //missing 2 in 20; without the 2 in 20 we get an arithmeticException error message

        //logic errors
        int steps = 10;
        for(int i = 1; i <= steps; i++){
            System.out.println("Step #" + i);
            //starting i at 0 will print out 0 - 10 rather than just 1 - 10.
        }




    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString = "Working hard is important, but there is something that matters even more: Believing in " +
                "yourself.";
        System.out.println(myString);

//        long myNumber = 123L;
//        System.out.println(myNumber);
        //works without the L because it falls in the numeric range long covers but good practice and sometimes code
        // wont work without the L.

        float myNumber = 3.14f;
        System.out.println(myNumber);

        int x = 5;
        x++; //commonly used and easier to understand
        System.out.println(x);
        //or System.out.println(++x);

//        String class = "Apex"; class is a reserved word in java and cannot be assigned.

        String theNumberThree = "three";
        Object o = theNumberThree;
        //int three = (int) 345L;
        //"three" cannot be cast into an integer. it doesnt work with strings, only with numbers.

        int three = Integer.parseInt("456"); //similar to javascript using parseInt() but you need to access the
        // class type to use it, hence, Integer.parseInt().

        x = 10;
        //x += 5;
        int y = 2;
//        y *= x;
        x/= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        x =Integer.MAX_VALUE; //max.value is a a const in the integer class; not a good idea to put this on a bank
        // account for example.
//        x++;
        System.out.println("MAXVAL + 1 " + x);


    }
}

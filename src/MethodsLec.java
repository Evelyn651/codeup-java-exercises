public class MethodsLec {
    public static void main(String[] args){
        countdownRecursion(5);
        countdown();
        System.out.println(sum(4, 3));
        System.out.println(sum(4.6, 3.2));
        System.out.println(sayHello());
        System.out.println(sum(2,4));
        System.out.println(sayHello("kili"));

    }

    // function sayHello(param1, param2){
    //     return "Hi Fer";
    // }
    // sayHello(); //call back the function in js. cant do this in java.
    public static String sayHello(){
        return "Hello World";
    }
    public static String sayHello (String name){
        sum(2,4);
        return "Hi " + name;//data type^ and ^ parameter
    }

    public static int sum(int num1, int num2){ //need to specify the data type for each parameter
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    //counting from 5 to 1 using a loop
    public static void countdown(){
        for (byte x = 5; x >= 0;x--){
            System.out.println(" for loop x = "+ x);
        }
    }

    public static void countdownRecursion(int n){
        System.out.println("recursion n = " + n);
        // how to stop
        if(n < 1){
            return;
        }

        //how to proceed
        n = n - 1;
        countdownRecursion(n);


    }
}

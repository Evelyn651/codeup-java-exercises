public class MethodsLec {
    public static void main(String[] args){
        System.out.println(sum(2,4));
        System.out.println(sayHello("kili"));

    }

    // function sayHello(param1, param2){
    //     return "Hi Fer";
    // }
    // sayHello(); //call back the function in js. cant do this in java.
    public static String sayHello (String name){
        sum(2,4);
        return "Hi " + name;//data type^ and ^ parameter
    }

    public static int sum(int num1, int num2){ //need to specify the data type for each parameter
        return num1 + num2;

    }
}

package util.java.util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        System.out.println( "your String: " + input.getString());

        System.out.println("yes or no: " + input.yesNo());
    }
}

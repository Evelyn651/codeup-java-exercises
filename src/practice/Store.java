package practice;

public class Store {

    // declare instance fields here!
    String productType;

    // constructor method
    public Store(String product) {
        System.out.println("I am inside the constructor method.");
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        Store lemonadeStand = new Store();

        System.out.println(lemonadeStand);
    }

}

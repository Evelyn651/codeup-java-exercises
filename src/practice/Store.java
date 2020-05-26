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
            //created an instance of Store and assigned the variable lemonadeStand and used lemonade as the parameter
            // value
            Store lemonadeStand = new Store("lemonade");

            System.out.println(lemonadeStand.productType);
        }



}

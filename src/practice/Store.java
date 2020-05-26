package practice;

public class Store {

    // declare instance fields here!
    String productType;
    //new fields- can have multiple
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        System.out.println("I am inside the constructor method.");
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");
        //created an instance of Store and assigned the variable lemonadeStand and used lemonade as the parameter
        // value
        Store lemonadeStand = new Store("lemonade", 6, 2.20);
        Store cookieShop = new Store("cookies", 12, 3.75);

        //Ordering matters. we must pass values into the constructor invocation in the same order that they're
        // listed in the parameters

        System.out.println("lemonadeStand.productType= " + lemonadeStand.productType +" "+ lemonadeStand.inventoryPrice);
        System.out.println("cookieShop.productType= " + cookieShop.productType +" "+ cookieShop.inventoryPrice);

    }


}

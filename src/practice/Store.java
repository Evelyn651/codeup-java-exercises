package practice;

public class Store {

    // declare instance fields here! //new fields- can have multiple
    String productType;
    int inventoryCount;
    double inventoryPrice;
    double price;

    // constructor method
    public Store(String product, int count, double price) {
        //why is this printing twice?
        System.out.println("I am inside the constructor method.");
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }
    //to cover cost inflation
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println(price);
    }

    //to get the total Price plus tax
    public double getPriceWithTax(){
        double totalPrice = price + (price *0.08);
        return totalPrice;
    }
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }
    //adding parameters to be used in multiple scopes
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, "+ customer + "!");
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

        //calling the advertise() method
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();

        //calling the greetCustomer() method
        lemonadeStand.greetCustomer("Evelyn");

        //calling the increasePrice method
        lemonadeStand.increasePrice(1.5);


    }


}

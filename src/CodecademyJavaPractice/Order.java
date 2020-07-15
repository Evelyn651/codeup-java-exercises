package CodecademyJavaPractice;

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(boolean filled, double cost, String shippingMethod){
        if(cost > 24.00){
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship(){
        if(isFilled){
            System.out.println("Shipping");
            System.out.println("Shipping cost = " + calculateShipping());
        }else{
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping(){
//        if(shipping.equals("Regular")){
//            return 0;
//        } else if (shipping.equals("Express")){
//            return 1.75;
//        }else {
//            return .50;
//        }
//        ^^^ Refactored into a swtich case
        double shippingCost;

        switch (shipping){
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args){
        Order book = new Order(true, 9.99, "Express");
        Order chemistrySet = new Order(false, 72.50, "Regular");

    book.ship();
    chemistrySet.ship();
    }
}

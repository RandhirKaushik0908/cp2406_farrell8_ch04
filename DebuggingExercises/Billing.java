public class Billing {
    public static double computeBill(double price){
        double tax = 0.08;
        return price + (tax * price);
    }
    public static double computeBill(double price, double quantity){
        double tax = 0.08;
        double totalPrice = price * quantity;
        return totalPrice + (tax * totalPrice);
    }
    public static double computeBill(double price, double quantity, double couponValue){
        double tax = 0.08;
        double totalPrice = (price * quantity) - couponValue;
        return totalPrice + (tax * totalPrice);
    }
    public static void main(String[] args){
    double price = 25, quantity = 5, couponValue = 15;
        double singleParameterPrice = computeBill(price);
        double doubleParameterPrice = computeBill(price, quantity);
        double tripleParameterPrice = computeBill(price, quantity, couponValue);
        System.out.println("This is the price from single parameter method: " + singleParameterPrice);
        System.out.println("This is the price from double parameter method: " + doubleParameterPrice);
        System.out.println("This is the price from triple parameter method: " + tripleParameterPrice);
    }
}

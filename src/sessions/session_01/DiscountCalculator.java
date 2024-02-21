package sessions.session_01;

import sessions.Session;

public class DiscountCalculator extends Session {
    private final double price;
    private final int discount;

    public DiscountCalculator() {
        double price = this.getPrice();
        int discount = this.getDiscount();

        if (price < 0 || discount < 0 || discount > 100) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.price = price;
        this.discount = discount;
    }

    private double getPrice() {
        this.getData("Selling price: ");
        return Double.parseDouble(this.input);
    }

    private int getDiscount() {
        this.getData("Discount: ");
        return Integer.parseInt(this.input);
    }

    private double calculateFinalPrice(double price, int discount) {
        return price - (price * (float) discount / 100);
    }

    public String getFinalPrice(){
        return "Final Price: " + calculateFinalPrice(this.price, this.discount);
    }
}

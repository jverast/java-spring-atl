package sessions.session_01;

import sessions.Session;

public class DiscountCalculator extends Session {
    private final double price;
    private final int discount;

    public DiscountCalculator() {
        this.getData("Selling price: ");
        double price = Double.parseDouble(this.input);

        this.getData("Discount: ");
        int discount = Integer.parseInt(this.input);

        if (price < 0) {
            System.out.println("Invalid selling price");
            System.exit(1);
        }

        if (discount < 0 || discount > 100) {
            System.out.println("Invalid discount");
            System.exit(1);
        }

        this.price = price;
        this.discount = discount;
    }

    private double calculateFinalPrice(double price, int discount) {
        return price - (price * (float) discount / 100);
    }

    public String getFinalPrice(){
        return "Final Price: " + calculateFinalPrice(this.price, this.discount);
    }
}

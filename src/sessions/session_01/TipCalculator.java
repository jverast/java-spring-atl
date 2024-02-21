package sessions.session_01;

import sessions.Session;

public class TipCalculator extends Session {
    private final double bill;
    private final int tipPercentage;

    public TipCalculator() {
        double bill = getBill();
        int tipPercentage = getTipPercentage();

        if (bill < 0 || tipPercentage < 0 || tipPercentage > 100) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.bill = bill;
        this.tipPercentage = tipPercentage;
    }

    private int getTipPercentage() {
        this.getData("Percentage of tip: ");
        return Integer.parseInt(this.input);
    }

    private double getBill() {
        this.getData("Total bill: ");
        return Double.parseDouble(this.input);
    }

    private double calculateTip(double bill, int tipPercentage) {
        return (bill * (float) tipPercentage / 100);
    }

    public void showTip(){
        System.out.println("Tip: " + calculateTip(this.bill, this.tipPercentage));
    }
}

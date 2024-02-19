package sessions.session_01;

import sessions.Session;

public class TipCalculator extends Session {
    private final double bill;
    private final int tipPercentage;

    public TipCalculator() {
        this.getData("Total bill: ");
        double bill = Double.parseDouble(this.input);

        this.getData("Percentage of tip: ");
        int tipPercentage = Integer.parseInt(this.input);

        if (bill < 0) {
            System.out.println("Invalid bill");
            System.exit(1);
        }

        if (tipPercentage < 0 || tipPercentage > 100) {
            System.out.println("Invalid tip percentage");
            System.exit(1);
        }

        this.bill = bill;
        this.tipPercentage = tipPercentage;
    }

    private double calculateTip(double bill, int tipPercentage) {
        return (bill * (float) tipPercentage / 100);
    }

    public String getTip(){
        return "Tip: " + calculateTip(this.bill, this.tipPercentage);
    }
}

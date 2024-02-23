package sessions.session_07;

import sessions.Session;

public class CompoundInterest extends Session {
    private final long principal;
    private final float rate;
    private final int time;

    public CompoundInterest() {
        this.principal = inputPrincipal();
        this.rate = inputRate();
        this.time = inputTime();
    }

    public void getAmount() {
        long amount = (long) calculateAmount();
        System.out.println("\nAmount: " + amount);
    }

    private double calculateAmount() {
        return principal * Math.pow((1 + rate), time);
    }

    private int inputPrincipal() {
        getData("Principal: ");
        return Integer.parseInt(this.input);
    }

    private float inputRate() {
        getData("Rate: ");
        return Float.parseFloat(this.input);
    }

    private int inputTime() {
        getData("Time: ");
        return Integer.parseInt(this.input);
    }
}

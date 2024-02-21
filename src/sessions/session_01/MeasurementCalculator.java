package sessions.session_01;

import sessions.Session;

public class MeasurementCalculator extends Session {
    private final double miles;

    public MeasurementCalculator() {
        double miles = this.getMiles();

        if (miles < 0) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.miles = miles;
    }

    public String toKilometers(){
        final double FACTOR = 1.60934;
        return "Converted to kilometers: " + this.miles * FACTOR;
    }

    private double getMiles() {
        this.getData("Miles: ");
        return Double.parseDouble(this.input);
    }
}

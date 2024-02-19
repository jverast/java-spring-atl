package sessions.session_01;

import sessions.Session;

public class MeasurementCalculator extends Session {
    private final double miles;

    public MeasurementCalculator() {
        this.getData("Miles: ");
        double miles = Double.parseDouble(this.input);

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
}

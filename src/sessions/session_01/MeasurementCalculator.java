package sessions.session_01;

import sessions.Session;

public class MeasurementCalculator extends Session {
    private double miles;

    public void getDataFromConsole() {
        this.getData("Miles: ");
        double miles = Double.parseDouble(this.input);

        if (miles < 0) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.miles = miles;
    }

    public String toKilometers(){
        return "Converted to kilometers: " + this.miles * 1.60934;
    }
}

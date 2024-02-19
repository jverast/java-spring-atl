import sessions.session_01.DiscountCalculator;
import sessions.session_01.DogCalculator;
import sessions.session_01.MeasurementCalculator;

public class Main {
    public static void main(String[] args) {

        /*
         * DogCalculator dog = new DogCalculator();
         * dog.getDataFromConsole();
         * System.out.println(dog.toHumanAge());
         * */

        /*
         * MeasurementCalculator mc = new MeasurementCalculator();
         * mc.getDataFromConsole();
         * System.out.println(mc.toKilometers());
         * */

         DiscountCalculator d = new DiscountCalculator();
         d.getDataFromConsole();
         System.out.println(d.getFinalPrice());

    }
}
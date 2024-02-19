import sessions.session_01.*;

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

        /*
         * DiscountCalculator d = new DiscountCalculator();
         * d.getDataFromConsole();
         * System.out.println(d.getFinalPrice());
         * */

        /*
         * TipCalculator t = new TipCalculator();
         * t.getDataFromConsole();
         * System.out.println(t.getTip());
         * */

        GuessGame g = new GuessGame();
        g.generateRandomNumber();
        g.guessNumber();
    }
}
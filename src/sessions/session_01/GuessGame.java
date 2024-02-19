package sessions.session_01;

import sessions.Session;

public class GuessGame extends Session {
    public int user;
    public int random;

    public void generateRandomNumber() {
        double random = Math.random();
        final int LIMIT = 100;

        this.random = (int) Math.floor(random * LIMIT);
    }

    public void guessNumber() {
        this.getData("¿Qué número es?: ");
        int number = Integer.parseInt(this.input);

        if(random == number) {
            System.out.println("Adivinaste el número :)");
        } else {
            guessNumber();
        }
    }
}

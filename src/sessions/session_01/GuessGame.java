package sessions.session_01;

import sessions.Session;

public class GuessGame extends Session {
    public int user;
    private final int random;
    final int LIMIT = 10;
    private int health;

    public GuessGame() {
        double random = Math.random();
        this.health = (int) Math.ceil(LIMIT * 0.25);
        this.random = (int) Math.floor(random * LIMIT);
    }

    public void guessNumber() {
        this.getData("¿Qué número es?: ");
        int number = Integer.parseInt(this.input);

        if (this.random == number) {
            System.out.println("Adivinaste el número :)");
        } else {
            health --;
            System.out.println("Te quedan " + health + " vidas restantes");
            if (health == 0) {
                System.out.println("Perdiste :(");
                System.exit(1);
            }

            guessNumber();
        }
    }
}

package sessions.session_01;

import sessions.Session;

public class GuessGame extends Session {
    private final int random;
    final int LIMIT = 10;
    private int health;

    public GuessGame() {
        double random = Math.random();
        this.health = (int) Math.ceil(this.LIMIT * 0.25);
        this.random = (int) Math.floor(random * this.LIMIT);
    }

    public void playGuessNumber() {
        int number = this.getNumber();

        if (this.random == number) {
            System.out.println("Adivinaste el número :)");
        } else {
            this.health --;
            System.out.println("Te quedan " + this.health + " vidas restantes");
            if (this.health == 0) {
                System.out.println("Perdiste :(");
                System.exit(0);
            }

            this.playGuessNumber();
        }
    }

    private int getNumber() {
        this.getData("¿Qué número es?: ");
        return Integer.parseInt(this.input);
    }
}

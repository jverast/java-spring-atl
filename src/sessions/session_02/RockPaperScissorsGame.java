package sessions.session_02;

import sessions.Session;

public class RockPaperScissorsGame extends Session {
    private final int computer;

    public RockPaperScissorsGame() {
        this.computer = generateRandomNumber();
    }

    public void playGame() {
        showGameRules();
        this.getData("¿Piedra, papel o tijera?: ");

        if(!this.input.matches("[123]")) {
            System.exit(1);
        }

        int player = Integer.parseInt(this.input);
        String result = getResult(player);

        System.out.println("Computadora: " + this.computer);
        System.out.println("\n" + result);
    }

    private void showGameRules() {
        System.out.println("Rock, Paper, Scissors Game!");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
    }

    private String getResult(int player) {
        String result;

        if(
            this.computer == 1 && player == 2 ||
            this.computer == 2 && player == 3 ||
            this.computer == 3 && player == 1
        ) {
            result = "Ganaste :)";
        } else if (this.computer == player) {
            result = "Empate :|";
        } else {
            result = "Perdiste :(";
        }

        return result;
    }

    private int generateRandomNumber() {
        return (int) Math.ceil(Math.random() * 3);
    }
}

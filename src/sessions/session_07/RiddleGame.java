package sessions.session_07;

import sessions.Session;

import java.util.ArrayList;
import java.util.List;

public class RiddleGame extends Session {
    private final List<Riddle> riddles;

    public RiddleGame() {
        RiddleCollection riddleCollection = new RiddleCollection();
        riddles = riddleCollection.getRiddles();
    }

    public void playRiddle() {
        int random = generateRandomNumber();

        Riddle riddle = riddles.get(random);

        System.out.println(riddle.question());
        String response = inputResponse();

        if(riddle.response().equalsIgnoreCase(response)) {
            System.out.println("\n¡Correcto!");
        } else {
            System.out.println("\n¡Incorrecto!. La respuesta era '" + riddle.response() + "'");
        }
    }

    private int generateRandomNumber() {
        return (int) Math.floor(Math.random() * riddles.size());
    }

    private String inputResponse() {
        getData("Response: ");
        return this.input;
    }
}

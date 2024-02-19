package sessions.session_01;

import sessions.Session;

public class DogCalculator extends Session {
    private final int age;

    public DogCalculator() {
        this.getData("Dog's age: ");
        int age = Integer.parseInt(this.input);

        if (age < 0) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.age = age;
    }

    public String toHumanAge(){
        final int FACTOR = 7;
        return "Converted to human: " + this.age * FACTOR;
    }
}

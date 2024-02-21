package sessions.session_01;

import sessions.Session;

public class DogCalculator extends Session {
    private final int age;

    public DogCalculator() {
        int age = getAge();

        if (age < 0) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.age = age;
    }

    private int getAge() {
        this.getData("Dog's age: ");
        return Integer.parseInt(this.input);
    }

    public String toHumanAge(){
        final int FACTOR = 7;
        return "Converted to human: " + this.age * FACTOR;
    }
}

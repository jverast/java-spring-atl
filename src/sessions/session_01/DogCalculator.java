package sessions.session_01;

import sessions.Session;

public class DogCalculator extends Session {
    private int age;

    public void getDataFromConsole() {
        this.getData("Dog's age: ");
        int age = Integer.parseInt(this.input);

        if (age < 0) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        this.age = age;
    }

    public String toHumanAge(){
        return "Converted to human: " + this.age * 7;
    }
}

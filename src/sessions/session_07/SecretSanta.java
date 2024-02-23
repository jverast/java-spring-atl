package sessions.session_07;

import sessions.Session;
import java.util.ArrayList;
import java.util.List;

public class SecretSanta extends Session {
    private final List<User> users = new ArrayList<>();
    private final List<Integer> secretNumbers = new ArrayList<>();

    public void playSecretSanta() {
        displayMenu();
        int option = getOption();
        displayMenuOptions(option);
    }

    private void displayMenuOptions(int option) {
        switch(option) {
            case 1: registerUser(); break;
            case 2: showRegisteredUsers(); break;
            case 3: generateSecretSanta(); break;
            case 4: showMySecretSanta(); break;
            case 5: System.exit(0); break;
            default:
                System.out.println("Invalid or incorrect data");
                System.exit(1);
        }

        clearScreen();
        System.out.println();
        playSecretSanta();
    }

    private void showMySecretSanta() {
        getData("Name: ");
        String name = this.input;

        int secretSantaIndex = -1;
        for(int i = 0; i < users.size(); i ++) {
            if(users.get(i).name().equalsIgnoreCase(name)) {
                secretSantaIndex = secretNumbers.get(i);
            }
        }

        if(secretSantaIndex == -1) {
            System.out.println("No user exists");
            playSecretSanta();
        } else {
            System.out.println("Your Secret Santa is: " + users.get(secretSantaIndex).name());
        }
    }

    private void generateSecretSanta() {
        int random;

        for(int i = 0; i < users.size(); i ++) {
            random = generateRandomNumber();
            while(secretNumbers.contains(random) || random == i) {
                random = generateRandomNumber();
            }
            secretNumbers.add(random);
        }

        System.out.println("Secret Santa generated successfully!");
    }

    private void registerUser() {
        getData("Name: ");
        String name = this.input;

        getData("Age: ");
        int age = Integer.parseInt(this.input);

        getData("Role: ");
        String role = this.input;

        User user = new User(name, age, role);
        users.add(user);
    }

    private void showRegisteredUsers() {
        System.out.print("[ ");
        for(int i = 0; i < users.size(); i ++) {
            if(i != users.size() - 1) {
                System.out.print(users.get(i).name() + ", ");
            } else {
                System.out.println(users.get(i).name() + " ]");
            }
        }
    }

    private int getOption() {
        getData("Select option: ");
        System.out.println();
        return Integer.parseInt(this.input);
    }

    private void displayMenu() {
        System.out.println("*------------- Secret Santa -------------*");
        System.out.println("1. Enter user information");
        System.out.println("2. Show registered users");
        System.out.println("3. Generate Secret Santa");
        System.out.println("4. Who is my Secret Santa?");
        System.out.println("5. Exit\n");
    }

    private int generateRandomNumber() {
        return (int) Math.floor(Math.random() * users.size());
    }
}

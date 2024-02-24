package sessions.session_08;

import sessions.Session;

import java.util.ArrayList;
import java.util.List;

public class RoleGame extends Session {
    private String option;
    private final List<Character> characters = new ArrayList<>();

    public void playGame() {
        showMenu();
        input("\nOption: ");
        selectMenuOption(Integer.parseInt(option));
    }

    private void selectMenuOption(int option) {
        switch(option) {
            case 1: createCharacter(); break;
            case 2: showCharacterStats(); break;
            case 3: simulateFight(); break;
            case 0: exit(); break;
        }

        clearScreen();
        playGame();
    }

    private void simulateFight() {
        if(characters.size() < 2) {
            System.out.println("2 or more characters needed to fight");
        } else {
            input("Select character by name: ");
            String name1 = this.input;

            input("Select character by name: ");
            String name2 = this.input;

            int characterIndex1 = getCharacterIndex(name1);
            int characterIndex2 = getCharacterIndex(name2);

           if(characterIndex1 == -1 || characterIndex2 == -1) {
               System.out.println("Some character does not exist");
           } else {
               Character c1 = characters.get(characterIndex1);
               Character c2 = characters.get(characterIndex2);

               System.out.println("\nLet's fight");
               int turns = 4;

               while(turns > 0) {
                   System.out.println("\nWhat do you want to do?");
                   System.out.println("1. Attack");
                   System.out.println("2. Ignore");
                   input("\nOption: ");
                   int option = Integer.parseInt(this.input);

                   if(turns % 2 == 0) {
                       if(option == 1) {
                           int damage = c1.attack();
                           c2.takeDamage(damage);
                       } else {
                           System.out.println("Ignored turn!");
                       }
                       System.out.println("Opponent health: " + c2.getHealth());
                   } else {
                       if(option == 1) {
                           int damage = c2.attack();
                           c1.takeDamage(damage);
                       } else {
                           System.out.println("Ignored turn!");
                       }
                       System.out.println("Opponent health: " + c1.getHealth());
                   }

                   turns --;
               }

               System.out.println();
               if(c1.getHealth() > c2.getHealth()) {
                   System.out.println(c1.getName() + " wins!");
               } else {
                   System.out.println(c2.getName() + " wins!");
               }
           }
        }
    }

    private void showCharacterStats() {
        input("Search by name: ");
        String name = this.input;
        int characterIndex = getCharacterIndex(name);

        if(characterIndex == -1) {
            System.out.println("No character exists");
        } else {
            getCharacterDetails(characterIndex);
        }
    }

    private void getCharacterDetails(int index) {
        Character c = characters.get(index);
        System.out.println("{ name: '" + c.getName() + "', health: '" + c.getHealth() + "', role: '" + c.getRole() + "' }");
    }

    private void createCharacter() {
        input("Name: ");
        String name = this.input;

        input("Role: ");
        String role = this.input.toLowerCase();

        if(getCharacterIndex(name) == -1) {
            if(!role.matches("warrior|wizard")) {
                System.out.println("Role no exists");
            } else {
                switch(role) {
                    case "warrior":
                        Character character1 = new Warrior(name);
                        characters.add(character1);
                        System.out.println("New character successfully added!");
                        break;
                    case "wizard":
                        Character character2 = new Wizard(name);
                        characters.add(character2);
                        System.out.println("New character successfully added!");
                        break;
                    default:
                        System.out.println("Role no exists");
                }
            }
        } else {
            System.out.println("Character name already exists!");
        }
    }

    private int getCharacterIndex(String name) {
        int characterIndex = -1;

        for (int i = 0; i < characters.size(); i++) {
            if(characters.get(i).getName().equalsIgnoreCase(name)) {
                characterIndex = i;
            }
        }

        return characterIndex;
    }

    private void showMenu(){
        System.out.println("********* Role Game Menu *********");
        System.out.println("1. Create character");
        System.out.println("2. Show character stats");
        System.out.println("3. Simulate a fight");
        System.out.println("0. Exit");
    }

    private void input(String text) {
        getData(text);
        option = this.input;
    }

    private void exit() {
        System.exit(0);
    }
}

package sessions.session_08;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 250, 18, 0.24f, 0.78f, "Warrior");
    }

    public int attack() {
        System.out.println("Warrior '" + name + "' attacks!");
        return (int) Math.floor((((level / 10.0) * powerAttack * (health / 250.0)) / 20  * (1 + attackSpeed) * accuracy * 100));
    };

    public void takeDamage(int damage) {
        health = Math.max(health - damage, 0);
    }
}

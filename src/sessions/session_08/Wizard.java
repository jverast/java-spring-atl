package sessions.session_08;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name,225, 27, 0.15f, 0.75f, "Wizard");
    }

    public int attack() {
        System.out.println("Wizard '" + name + "' attacks!");
        return (int) Math.floor((((level / 10.0) * powerAttack * (health / 250.0)) / 20  * (1 + attackSpeed) * accuracy * 100));
    };

    public void takeDamage(int damage) {
        health = Math.max(health - damage, 0);
    }
}

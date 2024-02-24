package sessions.session_08;

public abstract class Character {
    protected String name;
    protected int level = 1;
    protected int health;
    protected int powerAttack;
    protected float attackSpeed;
    protected float accuracy;
    protected String role;

    protected final int MAX_HEALTH = 350;

    public Character(String name, int health, int powerAttack, float attackSpeed, float accuracy, String role) {
        this.name = name;
        this.health = health;
        this.powerAttack = powerAttack;
        this.attackSpeed = attackSpeed;
        this.accuracy = accuracy;
        this.role = role;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public String getRole() { return role; }

    public abstract int attack();
    public abstract void takeDamage(int damage);
}

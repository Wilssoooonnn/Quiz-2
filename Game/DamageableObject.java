public abstract class DamageableObject extends GameObject {
    private int maxHealth;
    private int health;

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(getName() + " took " + damage + " damage. Remaining health: " + health);
        if (isDead()) {
            onKilled();
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public abstract void onKilled();
}

public class Monster extends DamageableObject {
    private int threatLevel;
    private String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String makeNoise() {
        return getName() + " roars menacingly!";
    }

    @Override
    public void onKilled() {
        System.out.println(getName() + " has been slain! Its threat level was " + threatLevel + ".");
        despawn();
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public String getColor() {
        return color;
    }
}

public class Player extends DamageableObject {
    private int score;
    private int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int score, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.score = score;
        this.livesRemaining = livesRemaining;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        if (livesRemaining > 0) {
            System.out.println(getName() + " lost a life! Lives remaining: " + livesRemaining);
        } else {
            System.out.println(getName() + " has died. Game Over!");
        }
        despawn();
    }

    public int getScore() {
        return score;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }
}

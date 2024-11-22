public class Main {
    public static void main(String[] args) {
        // Create Object player
        Player player = new Player("Hero", 10, 20, 100, 0, 3);
        System.out.println("Player " + player.getName() + " created with " + player.getHealth() + " health and "
                + player.getLivesRemaining() + " lives.");

        // Create Object monster
        Monster monster = new Monster("Goblin", 30, 40, 50, 5, "Green");
        System.out.println("Monster " + monster.getName() + " created with " + monster.getHealth()
                + " health and threat level " + monster.getThreatLevel() + ".");

        // Damage to monster
        monster.takeDamage(20);
        monster.takeDamage(30);

        // Player take damage
        player.takeDamage(50);
        player.takeDamage(60);
    }
}

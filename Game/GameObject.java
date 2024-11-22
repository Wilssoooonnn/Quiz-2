public class GameObject {
    private String name;
    private int x;
    private int y;

    public GameObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void despawn() {
        System.out.println(name + " has been despawned.");
    }
}

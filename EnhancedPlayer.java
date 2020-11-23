public class EnhancedPlayer {
    private String name, weapon;
    private int hitPoints = 100;

    public EnhancedPlayer(String name, String weapon, int hitPoints) {
        this.name = name;
        if (hitPoints >= 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }

        this.weapon = weapon;

    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("death");

        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
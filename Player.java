public class Player {
    public String name, weapon;
    public int health;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("death");

        }
    }

    public int healthremaaining() {
        return this.health;

    }

}

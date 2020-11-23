public class Fish extends Animal {
    private int gills, ayes, fins;


    public Fish(String name, int size, int weight, int gills, int ayes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.ayes = ayes;
        this.fins = fins;
    }



    private void swim(int speed) {
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }

    private void moveMuscles() {

    }

    private void moveBackfin() {


    }
    private void rest() {

    }
    public void rest(int x){
        x=5;
    }
}







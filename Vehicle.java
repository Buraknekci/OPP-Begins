public class Vehicle {
    public int curentVelocity, currentDirection;

    public String name, size;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.curentVelocity = 0;
        this.currentDirection = 0;

    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println(" Vehicle.steer(): Steering at " + currentDirection + " degrees ");


    }

    public void move(int velocity, int direction) {
        curentVelocity = velocity;
        currentDirection = direction;
        System.out.println(" Vehicle.move(): Moveving at " + curentVelocity + " in direction " + currentDirection);


    }

    public int getCurentVelocity() {
        return curentVelocity;
    }

    public void setCurentVelocity(int curentVelocity) {
        this.curentVelocity = curentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void stop() {
        this.curentVelocity = 0;
    }
}

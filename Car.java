public class Car extends Vehicle {
    public int wheels, doors, gears;
    public boolean isManual;
    public int currentGears;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGears = 1;
    }

    public void changeGear(int currentGears) {
        this.currentGears = currentGears;
        System.out.println(" Car.setCurrentGer() to  " + this.currentGears + " gear.");

    }public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("car.changeVelocity(): velocity "+speed+" direction "+direction  );

    }




}


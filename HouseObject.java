public class HouseObject {
    public static void main(String[] args) {
        WALL1 wall1 = new WALL1("West");
        WALL1 wall2 = new WALL1("East");
        WALL1 wall3 = new WALL1("South");
        WALL1 wall4 = new WALL1("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();


    }
}

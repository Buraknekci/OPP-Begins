

public class PCObject {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch", "Dell", 27, new Resolution(4553, 432));
        Motherboard theMotherboard = new Motherboard("badroadoadsr", "Del", "WINDOW", 4, 5);

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.poweUp();



    }
}

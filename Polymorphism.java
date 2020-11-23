

class Cars1 {
    private int wheels;
    private boolean enginne;
    private int cylinders;
    private String name;

    public Cars1(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.enginne = true;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String starEngine1() {
        return "car -> start engine";

    }

    public String accelarate() {
        return " car -> accelerate";

    }

    public String brake() {
        return "car break";
    }

}

class Porshe extends Cars1 {
    public Porshe() {
        super(16, "burak porshe");
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public String starEngine1() {
        return "porshe -> start engine";
    }

    @Override
    public String accelarate() {
        return " porshe -> accelerate";
    }

    @Override
    public String brake() {
        return "porshe is break";
    }
}

class Lamborgini extends Cars1 {
    public Lamborgini(int cylinders, String name) {
        super(16, "Burak Lambo");

    }

    @Override
    public String starEngine1() {
        return "lambo -> start engine";
    }

    @Override
    public String accelarate() {
        return " lambo -> accelerate";
    }
}

class Bugatti extends Cars1 {
    public Bugatti() {
        super(16, "burak bugatti");
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public String starEngine1() {
        return "bugatti -> start engine";
    }

    @Override
    public String accelarate() {
        return " bugatti -> accelerate";
    }

    @Override
    public String brake() {
        return "bugatti is break";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Cars1 cars1 = new Cars1(16, "BURAK");
        System.out.println(cars1.starEngine1() +
                "\n" + cars1.brake() + "\n"
                + cars1.getName());
        Porshe porshe = new Porshe();
        System.out.println(porshe.getName() + porshe.getCylinders());

        Bugatti bugatti = new Bugatti();
        System.out.println(bugatti.getName() + bugatti.accelarate());

    }
}

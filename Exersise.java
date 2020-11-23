public class Exersise {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setEngine(String engine) {
        String Validengine  =engine.toLowerCase()   ;
        if (Validengine.equals("v12")|| Validengine.equals("holden")){
            this.engine = engine;
        }else {
            this.engine="Unknown";
        }


    }

    public String getEngine() {
        return this.engine;
    }
}


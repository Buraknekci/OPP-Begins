public class Carpet {
    public double cost;


    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost(double cost) {
        if (this.cost < 0) {
            this.cost = 0;
        }
        return this.cost;
    }


    public void setCost(double cost) {


        this.cost = cost;
    }

    public double getCost() {
        return getCost(cost);
    }

}

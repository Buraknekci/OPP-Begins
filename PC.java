public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public  void poweUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private  void  drawLogo(){
        monitor.drawPixelAt(30,40,"dark");
    }
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }


}

public class PrinterObject {
    public static void main(String[] args) {
        Printer printer=new Printer(50,false);
        System.out.println("Initial Pages count= " +printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(4);
        System.out.println("pages printed= "+pagesPrinted+" ,new  total= "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("pages printed= "+pagesPrinted+" ,new  total= "+printer.getPagesPrinted());
    }
}



public class BankAcountMain {

    public static void main(String[] args) {

        Exersise porsche = new Exersise();
        Exersise holden = new Exersise();
        porsche.setEngine("v12");
        System.out.println("engine is " + porsche.getEngine());

        SimleCalculator calculator = new SimleCalculator();
        calculator.setFirstNumber(0);
        calculator.setSecondNumber(0);
        System.out.println("add=" + calculator.getAdditionResult());
        System.out.println("subtract=" + calculator.getSubtractionResult());

        System.out.println("division=" + calculator.getDivisionResult());

        Person person = new Person();
        person.setLastName("İnekci");
        person.setFirsName("burak");
        person.setAge(15);
        System.out.println("last name is  " + person.getLastName() + " first name is " + person.getFirsName() + " age is =" + person.getAge());


        BankAccount burakaccount = new BankAccount("54556", 50, "burak", "5425064077", "burak.nekci@gmail.com");

        System.out.println(burakaccount.getAccountNumber());
        System.out.println(burakaccount.getBalance());
        System.out.println(burakaccount.getEmail());
        System.out.println(burakaccount.getName());
        System.out.println(burakaccount.getName());


        burakaccount.withdrawal(100);
        burakaccount.deposid(50);
        burakaccount.withdrawal(100);


    }
}

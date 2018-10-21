package pl.sda.staticfinal;

public class Main {

    public static void main(String[] args) {

        StaticTest.VALUE = 7;
        StaticTest object1 = new StaticTest();
        object1.setFirstName("Waldek");
        object1.setLastName("Nowak");
        object1.setAge(25);

        printText(object1);

        StaticTest object2 = new StaticTest();
        object2.setFirstName("Aleksandra");
        object2.setLastName("Kowalska");
        object2.setAge(30);

        printText(object2);

        object1.test();
        object2.test();

        StaticTest.testStatic();
        object1.testStatic();
        object2.testStatic();
    }

    private static void printText(StaticTest test) {
        System.out.println("Wynik imie: "
                + test.getFirstName() + " nazwisko: " + test.getLastName() +
                " age: " + test.getAge() +
                " value: " + test.VALUE
        );
    }
}

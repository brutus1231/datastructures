package pl.sda.staticfinal;

public class FancyFinalTest extends FinalTest {

    public FancyFinalTest(String lastName) {
        super(lastName);
    }

    public FancyFinalTest(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String testMethod() {
        return super.testMethod() + "!";
    }

// nie można nadpisać metody final przy dziedziczeniu
//    @Override
//    public final String testFinalMethod(){
//        return "test";
//    }

    public static void main(String[] args) {

        FancyFinalTest object1 = new FancyFinalTest("Kasia");
        System.out.println(object1.testMethod());
        System.out.println(object1.testFinalMethod());

        object1.testMethod();

    }
}

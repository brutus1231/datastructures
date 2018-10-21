package pl.sda.staticfinal;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FinalTest {

    private String firstName;
    private final String lastName;
    private Integer age;

    public FinalTest() {
        lastName = null;
    }

    public FinalTest(String lastName) {
        this.lastName = lastName;
    }

    public FinalTest(String firstName, String lastName) {
        this(lastName);
        this.firstName = firstName;
    }

    public FinalTest(String firstName, String lastName, Integer age) {
        this(firstName, lastName);
        this.age = age;
    }

    public String testMethod() {
        return "test";
    }

    public final String testFinalMethod(){
        return "test";
    }

    public static void main(String[] args) {
        FinalTest object1 = new FinalTest("Nowak");

        object1.setFirstName("Ania");
        object1.setFirstName("Ola");

        System.out.println(object1.testMethod());
        System.out.println(object1.testFinalMethod());
    }
}

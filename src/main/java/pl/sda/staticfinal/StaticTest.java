package pl.sda.staticfinal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaticTest {

    public static Integer VALUE = 5;

    private String firstName;
    private String lastName;
    private Integer age;

    public void test() {
        System.out.println("Test " + firstName);
    }

    public static void testStatic(){
        StaticTest x = new StaticTest();
        System.out.println("Test static " + VALUE);
    }


}

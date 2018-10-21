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
        System.out.println("Test");
    }

    public static void testStatic() {
        System.out.println("Test Static");
    }

}

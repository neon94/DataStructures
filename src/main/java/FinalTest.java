import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinalTest {

    private String firstName;
    private final String lastName;

    public FinalTest(String lastName) {
        this.lastName = lastName;
    }

    public String testMethod() {
        return "test";
    }

    public final String testStaticMethod() {
        return "test";
    }

    public static void main(String[] args) {
        FinalTest object1 = new FinalTest("Nowak");
        object1.setFirstName("Ruperto");
        object1.setFirstName("Alberto");

        System.out.println(object1.testMethod());
        System.out.println(object1.testStaticMethod());
    }



}

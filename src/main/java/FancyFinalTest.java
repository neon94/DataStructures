public class FancyFinalTest extends FinalTest {

    public FancyFinalTest(String lastName) {
        super(lastName);
    }

    //nie można nadpisać metody final przy dziedziczeniu
//    @Override
//    public final String testFinalMethod() {
//    return "test";
//    }

    @Override
    public String testMethod() {
        return "test";
    }

    public static void main(String[] args) {

        FancyFinalTest object1 = new FancyFinalTest("Kasia");
        System.out.println(object1.testMethod());
        System.out.println(object1.testStaticMethod());
    }

}

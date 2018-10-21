public class Main {

    public static void main(String[] args) {

        StaticTest.VALUE = 8;
        StaticTest object1 = new StaticTest();
        object1.setFirstName("Waldek");
        object1.setLastName("Kowalski");
        object1.setAge(40);
        System.out.println("Wynik object1:\n" +
                "\nMy name is: " + object1.getFirstName() +
                "\nMy lastname is: " + object1.getLastName() +
                "\nI'm " + object1.getAge() + " years old" +
                "\nvalue: " + StaticTest.VALUE);


        StaticTest object2 = new StaticTest();
        object2.setFirstName("Rupert");
        object2.setLastName("Sroda");
        object2.setAge(35);
        System.out.println("Wynik object1:\n" +
                "\nMy name is: " + object2.getFirstName() +
                "\nMy lastname is: " + object2.getLastName() +
                "\nI'm " + object2.getAge() + " years old" +
                "\nvalue: " + StaticTest.VALUE);

    }

}

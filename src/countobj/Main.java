package countobj;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ana", "0993", "12");
        Person p2 = new Person("Ana", "0993", "12");
        Person p3 = new Person("Ana", "0993", "12");
        Person p4 = new Person("Ana", "0993", "12");

        System.out.println(Person.getCount());
    }
}

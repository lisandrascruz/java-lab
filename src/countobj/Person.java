package countobj;

public class Person {

    private String name;
    private String phone;
    private String age;
    private static int count = 0;

    public Person(String name, String phone, String age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        setCount(getCount()+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

}

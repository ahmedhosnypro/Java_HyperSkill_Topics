

public class trying {
    public static void main(String[] args) {

    }
}
 class Book {
    private String title = "The Great Gatsby";

    public void read() {
        System.out.println("Reading " + title);
    }
}
class Cup {
    public void fill() {
        System.out.println("Fill me up, I'm a cup.");
    }
}
class A {
    {
        System.out.println(10);
    }
}

class B extends A{
    {
        System.out.println(20);
    }
}

class C extends B{
    {
        System.out.println(5);
    }
}


class Student extends Person{
    int studentId;
    public Student(String name, int id) {
        this.name = name;
        this.studentId = id;
    }
}

class Person {
    String name;
    int age;

    public void goToSleep() {
        System.out.println(name + " is sleeping...");
    }
}
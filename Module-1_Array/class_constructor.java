class Student {
    String name;
    int age;

    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }
}

class Stud {
    String name;
    int age;

    Stud(String n, int a) {
        System.out.println("constructor");
        this.name = n;
        this.age = a;
    }

    void getName() {
        System.out.println(name);
    }

    void getAge() {
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student a = new Student();
        a.name = "niha";
        a.age = 18;

        a.getName();
        a.getAge();

        Stud b = new Stud("anu", 19);
        b.getName();
        b.getAge();
    }
}

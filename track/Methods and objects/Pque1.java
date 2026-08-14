
public class Pque1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setting("Bhargav", 22, 6.3);
        s1.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    void setting(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

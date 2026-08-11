
public class Pgm1 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 10;
        e1.name = "Bhargav";
        System.out.println(e1.id);
        System.out.println(e1.name);
        Employee e2;
        e2 = e1;
        e2.id = 100;
        e2.name = "Bhargavv";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
        e1.work();
        e2.work();
    }
}

class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

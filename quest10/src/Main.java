public class Main {
    public static void main(String[] args) {
        new Student(1,"tom",10.0);
        new Student(2,"tom",10.0);
        new Student(3,"tom",10.0);
        new Student(8,"tom",10.0);
        new Student(5,"tom",10.0);
        new Student(6,"tom",10.0);
        new Student(7,"tom",10.0);
        new Student(4,"tom",10.0);
        new Student(10,"tom",10.0);
        System.out.println(Student.listAll());
        Student.sort();
        System.out.println(Student.listAll());

    }

}

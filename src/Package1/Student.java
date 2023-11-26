package Package1;

public class Student {
    int rollNumber;
    int age;
    public void display1()
    {
        System.out.println("Welcome to all of you ");
    }

    public void display2()
    {
        System.out.println("Automation is very Easy");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNumber=1;
        s.age=25;
        System.out.println("Roll Number : "+s.rollNumber);
        System.out.println("Age :" + s.age);
        s.display1();
        s.display2();
        System.out.println("Change done for Git");


    }
}

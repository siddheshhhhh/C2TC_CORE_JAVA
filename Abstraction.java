abstract class Person {
    abstract void walk();             // no implementation of abstreact
    public void eat() {
        System.out.println("Person is eating");
    }
    Person() {
        System.out.println("Perosn CLass");
    }
}
class Student extends Person {
    Student() {
        System.out.println("In Student Class");
    }
    void walk() {
        System.out.println("Student is walking");       // abstreact method implementation
    }
}
class Child extends Person {
    Child() {
        System.out.println("In Child Class");
    }
    void walk() {
        System.out.println("Child is walking");
    }
}
class Abstraction  {
    public static void main(String[] args) {
        Student s=new Student();
        s.walk();
        s.eat();
        Child c=new Child();
        c.walk();
        c.eat();
    }
}
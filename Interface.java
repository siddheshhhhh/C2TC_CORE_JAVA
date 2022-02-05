interface Animal {
    int eye=2;       // gets final and static in interface 
    void walk();     // gets abstract directly in interface
}
interface Dog {
    void walk(); 

}
class Cat implements Animal,Dog {
    public void walk() {
    System.out.println("Cat is Walking");
    }
}    
public class Interface {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.walk();
    }
} 
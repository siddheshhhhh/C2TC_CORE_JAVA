class Pen{
    String name;
    String color;

    Pen(String name,String color) {              //Parameterized Constructor
        System.out.println("Pen Constructor");
        this.name=name;
        this.color=color;
      
    }
    Pen(Pen p2){
        System.out.println("Copy Constructor");  //Copy Constructor only new oject 
        this.name=p2.name;
        this.color=p2.color;
    }
    void PenInfo() {
        System.out.println(this.name);
        System.out.println(this.color);

    }
}
class Student{
    String name;
    int RollNo;

    Student(String name){
        System.out.println("Student Constructor");
        this.name=name;
       
    }

    void StudInfo() {
        System.out.println(this.name);
        System.out.println(this.RollNo);
    }
}
class OOP{
    public static void  main(String[] args) {
    Pen p1=new Pen("Addgel","Black");        //passing value while creating object
    p1.PenInfo();    
    Pen p2=new Pen(p1);                      // previous object reference
    p2.PenInfo();                         // calling method by object

    Student s1=new Student("Siddz");
    s1.RollNo=1;
    s1.StudInfo();
    }
}
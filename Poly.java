class Student{
    String name;
    int Roll;

    public void StudInfo(String name){        // method overloadings
        System.out.println(name);
    }
    public void StudInfo(int Roll){           // should have either different return type
        System.out.println(Roll);             // or different parameters
    }
    public void StudInfo(String name,int Roll){
        System.out.println(name +  + Roll);
    }
       
    
}
class Poly{
    public static void main(String[] args) {
    Student s1=new Student();
    s1.Roll=1;
    s1.name="Siddhesh";
    s1.StudInfo(s1.name,s1.Roll);   // calling by object and the variable
    }
}
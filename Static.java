class Student {
    static int time;
    String name;

    public static void changeTime() {
        time=7;
    }
    
}
class Static {
    public static void main(String[] args) {
        Student.time=9;
        Student s=new Student();
        s.name="Sid";
        System.out.println(s.time);
    }
}
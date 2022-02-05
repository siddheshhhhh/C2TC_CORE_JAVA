class A extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<2;i++) {
            System.out.println(name);
           
        }
    }
}
class B extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<2;i++) {
            System.out.println(name);
            Thread.yeild();
        }
    }
}
class Yeild {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
class T extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<=3;i++) {
            System.out.println(name);
        }
    }
}
class Join {
    public static void main(String[] args) {
    T t1=new T();
    T t2=new T();
    T t3=new T();
    t1.setName("Thread 1");
    t2.setName("Thread 2");
    t3.setName("Thread 3");

    t3.start();
    try {
        t3.join();       // join halt
    }
    catch(InterruptedException e) {

    }
    t1.start();
    t2.start();
    String name=Thread.currentThread().getName();
    for(int i=0;i<=3;i++) {
        System.out.println(name);
    }
  }
}
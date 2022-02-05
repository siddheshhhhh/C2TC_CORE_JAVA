class T extends Thread {
    public void run() {
        String name=Thread.currentThread().getName();
        try {
            for(int i=1;i<=3;i++) {
            System.out.println(name);
            Thread.sleep(3000);
          }
        }
        catch(InterruptedException e){

        }
    }
}
class Sleep {
    public static void main(String[] args) {
    T t1=new T();
    T t2=new T();
    T t3=new T();
    t1.setName("Thread 1");
    t2.setName("Thread 2");
    t3.setName("Thread 3");

    t1.start();
    t2.start();
    t3.start();
  }
}
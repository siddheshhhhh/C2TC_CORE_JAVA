class A implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=2;i++) {
            System.out.println("Sid");
        }
    }
}
class ByInterface {
    public static void main(String[] args) {
        A t=new A();
        Thread t1=new Thread(t);   // object reference to use run
        t1.start();
	for(int i=0;i<=2;i++) {
            System.out.println("Main Thread");
        }

    }
}
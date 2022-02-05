class A extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=2;i++) {
            System.out.println("Sid");
        }
    }
}
class ByExtexndingThread {
    public static void main(String[] args) {
        A t1=new A();
        t1.start();
        for(int i=0;i<=2;i++) {
        System.out.println("Siddhesh");
        }
		
    }   
}   
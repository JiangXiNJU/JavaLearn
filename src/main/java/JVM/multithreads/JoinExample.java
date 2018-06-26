package JVM.multithreads;
/**
 * 6、线程间的协作
 */
public class JoinExample {

    private class A extends Thread {
        @Override
        public void run() {
            try{
                System.out.println("A1");
                Thread.sleep(200);
                System.out.println("A2");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                System.out.println("B1");
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B2");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();

    }
    public static void main(String[] args) {
        JoinExample example = new JoinExample();
        example.test();
    }
}

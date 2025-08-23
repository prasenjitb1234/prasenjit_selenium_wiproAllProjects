package Multi_Threading;

class Shared {
    int num;
    boolean ready = false;

    synchronized void produce(int n) {
        if (ready) return;   // already produced, skip
        num = n;
        System.out.println("Produced: " + num);
        ready = true;
        notify();
    }

    synchronized void consume() {
        while (!ready) { // wait until ready is true
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + num);
    }
}

public class wait_demo {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> s.produce(6)).start();  
        new Thread(() -> s.consume()).start();   // ✅ fixed
    }
}

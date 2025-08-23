package Multi_Threading;

class StopTh extends Thread {
		
    boolean r = true;

    public void run() {
    	
        System.out.println("Thread starts ..");
        
        
        while (r) {
        	
            System.out.println("thread is running.. ");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("thread stopped!");
    }

    public void stopThread() {
        r = false;
    }
}

public class Stop_Thread {
    public static void main(String[] args) throws InterruptedException {
        StopTh t1 = new StopTh();
        t1.start();

        Thread.sleep(2000);

        t1.stopThread(); // stops 
        
    }
}

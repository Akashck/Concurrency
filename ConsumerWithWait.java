import java.util.Queue;

public class ConsumerWithWait implements Runnable{

    private final Queue<Integer> queue;
   // private int max;

    public ConsumerWithWait(Queue<Integer> queue) {
        super();
        this.queue = queue;
     //   this.max = max;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (queue) {
                while(queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException ex) {
                       // ex.printStackTrace();
                    }
                }
                System.out.println("Consumer queue is working " + queue.remove());
                queue.notifyAll();
            }
        }
    }
}

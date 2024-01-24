import java.util.Queue;
import java.util.Random;

public class ProducerWithWait implements Runnable {
    private Queue<Integer> queue;
    private int max;
    int count = 0;

    public ProducerWithWait(Queue<Integer> queue, int max) {
        super();
        this.queue = queue;
        this.max = max;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == max) {
                    try {
                        queue.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Producer is working with queue");
                queue.add(count);
                count++;
                queue.notifyAll();
            }
        }
    }
}

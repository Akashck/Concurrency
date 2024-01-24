import java.util.concurrent.BlockingQueue;

public class ProducerDqueue implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;
    private int count = 1;

    public ProducerDqueue(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (count < 5) {
            try {
                blockingQueue.put(count);
                System.out.println("prodcuer Thread is working");
            } catch (InterruptedException e) {
               // e.printStackTrace();
            }
            count++;
        }
    }
}
